package packageDemo.university.students;


import packageDemo.university.courses.Course;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> enrolledCourses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(name + " has enrolled in the course: " + course.getCourseName());
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + "'" + ", studentId=" + studentId +
               ", enrolledCourses=" + enrolledCourses + '}';
    }
}

