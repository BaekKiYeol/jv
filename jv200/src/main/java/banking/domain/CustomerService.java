package banking.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Customer에 대한 서비스를 처리하는 클래스
public interface CustomerService {
   //주요메소드
   
   List<String> allCustomers = new ArrayList<String>();
   
   public void addCustomer(Customer customer); //신규 고객추가
   
   public Customer getCustomerByssn(String ssn);//주민번호로 고객 조회
   
   public Collection<Customer> getAllCustomers();//전체 고객 목록
   
   public int getNumOfCustomers();//전체 고객 수
   
   /* 기타
    *  CustomerService는 고객의 정볼르 보관할 수 있는 속성을 유지해야한다. <Generic>
    *  고객의 정보를 유지할 수 있는 속성을 정의하라.
    */
}