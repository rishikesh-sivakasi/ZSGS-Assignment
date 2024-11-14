package Inheritance;

public class Student {
     private String name;
     private int age;
 
     public Student() {
         this.name = "Unknown";
         this.age = 0;
         System.out.println("Parent (Student) constructor with no parameters called.");
     }
 
     public Student(String name) {
         this.name = name;
         this.age = 0;
         System.out.println("Parent (Student) constructor with 1 parameter called.");
     }
 
     public Student(String name, int age) {
         this.name = name;
         this.age = age;
         System.out.println("Parent (Student) constructor with 2 parameters called.");
     }
 
     public String getName() {
         return name;
     }
 
     public int getAge() {
         return age;
     }
 }
 
 class ZSGSStudent extends Student {
     private String studentId;
     private String course;
 
     public ZSGSStudent() {
         super();
         this.studentId = "Not Assigned";
         this.course = "Undecided";
         System.out.println("Child (ZSGSStudent) constructor with no parameters called.");
     }
 
     public ZSGSStudent(String name) {
         super(name);
         this.studentId = "Not Assigned";
         this.course = "Undecided";
         System.out.println("Child (ZSGSStudent) constructor with 1 parameter called.");
     }
 
     public ZSGSStudent(String name, int age, String studentId, String course) {
         super(name, age);
         this.studentId = studentId;
         this.course = course;
         System.out.println("Child (ZSGSStudent) constructor with 3 parameters called.");
     }
 
     public String getStudentId() {
         return studentId;
     }
 
     public String getCourse() {
         return course;
     }
 }
 
 class Main {
     public static void main(String[] args) {
         System.out.println("Creating ZSGSStudent with no parameters:");
         new ZSGSStudent();
         System.out.println();
 
         System.out.println("Creating ZSGSStudent with 1 parameter:");
         new ZSGSStudent("Rishi");
         System.out.println();

         System.out.println("Creating ZSGSStudent with 3 parameters:");
         new ZSGSStudent("Rishi", 21, "ZS-INC-0520/24", "Java");
         System.out.println();
     }
 }
 
