package packageDemo;

import packageDemo.university.students.Student;
import packageDemo.university.courses.Course;
import packageDemo.university.faculty.Faculty;

public class UniversityDemo {
    public static void main(String[] args) {
        Course course1 = new Course("Mathematics", "MATH101", 3);
        Course course2 = new Course("Computer Science", "CS102", 4);

        Faculty faculty1 = new Faculty("Mr. Vairamuthu", "F001");
        Faculty faculty2 = new Faculty("Dr. Ravi Sankar", "F002");

        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);

        Student student1 = new Student("rishi", 1001);
        Student student2 = new Student("ram", 1002);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course2);

        System.out.println("\n--- Faculty Details ---");
        System.out.println(faculty1);
        System.out.println(faculty2);

        System.out.println("\n--- Student Details ---");
        System.out.println(student1);
        System.out.println(student2);
    }
}

