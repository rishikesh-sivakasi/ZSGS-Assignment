import java.util.ArrayList;
import java.util.List;

public class Employee {
     private int id;
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private double salary;
 
     public Employee(int id, String firstName, String lastName, String email, String phoneNumber, double salary) {
         this.id = id;
         this.firstName = firstName;
         this.lastName = lastName;
         this.email = email;
         this.phoneNumber = phoneNumber;
         this.salary = salary;
     }
 
     public int getId() {
         return id;
     }
 
     public String getFirstName() {
         return firstName;
     }
 
     public String getLastName() {
         return lastName;
     }
 
     public String getEmail() {
         return email;
     }
 
     public String getPhoneNumber() {
         return phoneNumber;
     }
     
     public double getSalary() {
         return salary;
        }
 
     public void displayEmployeeInfo() {
         System.out.println("Employee ID: " + id);
         System.out.println("Name: " + firstName + " " + lastName);
         System.out.println("Email: " + email);
         System.out.println("Phone Number: " + phoneNumber);
         System.out.println("Salary: $" + salary);
         System.out.println();
        }
 }

 class Company {
     private List<Employee> employees;
 
     public Company() {
         employees = new ArrayList<>();
     }
 
     public void addEmployee(int id, String firstName, String lastName, String email, String phoneNumber, double salary) {
         Employee newEmployee = new Employee(id, firstName, lastName, email, phoneNumber, salary);
         employees.add(newEmployee);
     }
 
     public void displayAllEmployees() {
         if (employees.isEmpty()) {
             System.out.println("No employees in the company.");
         } else {
             System.out.println("Employees in the company:");
             for (Employee employee : employees) {
                 employee.displayEmployeeInfo();
             }
         }
     }
 }
 

class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(1, "Rishi", "kesh", "rishi@example.com", "1234567890", 70000);
        company.addEmployee(2, "Roshan", "David", "roshan@example.com", "0987654321", 80000);
        company.addEmployee(3, "San", "tosh", "san@example.com", "1112223333", 60000);

        company.displayAllEmployees();
    }
}
