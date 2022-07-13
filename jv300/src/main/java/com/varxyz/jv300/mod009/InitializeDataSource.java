package com.varxyz.jv300.mod009;

import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializeDataSource implements ServletContextListener {
	private static final String JDBC_FILE_PATH = "/WEB-INF/classes/jdbc.properties";
	
	public void contextInitialized(ServletContextEvent event)  { 
    	ServletContext context = event.getServletContext();
    	InputStream is = null;
    	try {
    		is = context.getResourceAsStream(JDBC_FILE_PATH);
    		Properties prop = new Properties();
    		prop.load(is);
    		
    		String jdbcDriver = prop.getProperty("jdbc.driver");
    		String jdbcUrl = prop.getProperty("jdbc.url");
    		String userName = prop.getProperty("jdbc.username");
    		String passwd = prop.getProperty("jdbc.passwd");
    		
    		DataSource dataSource = new DataSource(jdbcDriver, jdbcUrl, userName, passwd);
    		
    		context.setAttribute("dataSource", dataSource);
    		
    		NamingService namingService = NamingService.getInstance();
    		namingService.setAttribute("dataSource", dataSource);
    		
    		System.out.println("DataSource has been initialized.");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

	public void contextDestroyed(ServletContextEvent event)  { 
         
    }
	
}
