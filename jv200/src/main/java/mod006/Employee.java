package mod006;

import java.util.Objects;

//import java.util.Date;

public class Employee {
    public String name;
      protected double salary;
      public MyDate birthDate;
      
      public String getDetails() {
         return "Name: " + name + "\nSalary: " + salary;
      }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public MyDate getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(MyDate birthDate) {
      this.birthDate = birthDate;
   }
      
   @Override
//   public boolean equals(Object obj) {
//         if (this == obj) 
//            return true;
//         if (obj == null || getClass() != obj.getClass()) 
//            return false;
//         Employee e = (Employee) obj;
//         return name == e.name && Objects.equals(name, e.name); 
//      }
   public boolean equals(Object obj) {
      if(obj instanceof Employee) {
         Employee e = (Employee) obj;
         if(e.getName().equals(name) && e.getBirthDate().equals(birthDate)) {
            return true;
         }
      }
      return false;
   }
}