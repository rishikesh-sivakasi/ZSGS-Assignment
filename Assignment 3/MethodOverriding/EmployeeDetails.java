package MethodOverriding;

abstract class Employee {
     public String employeeId;
     public String employeeName;

     Employee(String id, String name){
          employeeId = id;
          employeeName = name;
     }
     abstract String getEmployeeDetails();
}

class HourlyEmployee extends Employee{
     public String employeeType;

     HourlyEmployee(String id, String name, String type){
          super(id,name);
          employeeType = type;
     }

     String getEmployeeDetails(){
          return "EmployeeId : "+this.employeeId+"\nName : "+this.employeeName+"\nEmployeeType : "+this.employeeType;
     }

}

class SalariedEmployee extends Employee{
     public String employeeType;

     SalariedEmployee(String id, String name, String type){
          super(id,name);
          employeeType = type;
     }

     String getEmployeeDetails(){
          return "EmployeeId : "+this.employeeId+"\nName : "+this.employeeName+"\nEmployeeType : "+this.employeeType;
     }

}

class EmployeeDetails {
     public static void main(String[] args) {
          Employee e1 = new HourlyEmployee("1", "Rishi", "HourlyEmployee");
          Employee e2 = new SalariedEmployee("2", "Rishikesh", "SalaryEmployee");
          System.out.println(e1.getEmployeeDetails());
          System.out.println(e2.getEmployeeDetails());
     }
     
}