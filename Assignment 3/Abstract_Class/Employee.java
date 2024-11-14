package Abstract_Class;

abstract class Employee {
     private String employeeId;
     private String employeeName;

     
     Employee(String id, String name){
          employeeId = id;
          employeeName = name;
     }
     
     public String getEmployeeId() {
          return employeeId;
     }

     public String getEmployeeName() {
          return employeeName;
     }

     abstract String getEmployeeDetails();
     abstract double calculatePay();
}

class HourlyEmployee extends Employee{
     private String employeeType;
     private double salary;
 
     HourlyEmployee(String id, String name, String type, double salary){
          super(id,name);
          employeeType = type;
          this.salary = (salary * 8)*30;
     }
     
     public String getEmployeeType() {
          return employeeType;
     }

     public double getSalary() {
          return salary;
     }

     String getEmployeeDetails(){
          return "EmployeeId : "+super.getEmployeeId()+"\nName : "+super.getEmployeeName()+"\nEmployeeType : "+getEmployeeType();
     }

     double calculatePay(){
          return salary * 0.40;
     }
}

class SalariedEmployee extends Employee{
     private String employeeType;
     private double salary;

     SalariedEmployee(String id, String name, String type, double salary){
          super(id,name);
          employeeType = type;
          this.salary = salary;
     }
     
     public String getEmployeeType() {
          return employeeType;
     }

     public double getSalary() {
          return salary;
     }

     String getEmployeeDetails(){
          return "EmployeeId : "+super.getEmployeeId()+"\nName : "+super.getEmployeeName()+"\nEmployeeType : "+getEmployeeType();
     }
     double calculatePay(){
          return salary * 0.40;
     }

}

class EmployeeDetails {
     public static void main(String[] args) {
          Employee e1 = new HourlyEmployee("1", "Rishi", "HourlyEmployee",100);
          Employee e2 = new SalariedEmployee("2", "Rishikesh", "SalaryEmployee",10000);
          System.out.println(e1.getEmployeeDetails()+"\nSalary :"+e1.calculatePay());
          System.out.println(e2.getEmployeeDetails()+"\nSalary :"+e2.calculatePay());
     }
     
}