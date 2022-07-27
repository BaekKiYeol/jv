package com.varxyz.test.mvc;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.varxyz.test.mvc.Account.AccountDao;
import com.varxyz.test.mvc.Customer.CustomerDao;


@Configuration
//@ComponentScan(basePackages = "com.varxyz.test.mvc.Controller") -- 폴더 안에 넣으려면 이렇게
@ComponentScan(basePackageClasses = {CustomerDao.class, AccountDao.class}) //빈 안쓰면 요걸로
public class DataSourceConfig {
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Seoul");
		ds.setUsername("test");
		ds.setPassword("test");
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		ds.setMaxIdle(10);
		return ds;
	}
	
//	@Bean
//	public CustomerDao customerDao() {
//		return new CustomerDao(dataSource()); // 같은 경로가 아닐 경우
//	}
//	
//	@Bean
//	public AccountDao accountDao() {
//		return new AccountDao(dataSource());
//	}
	
}
