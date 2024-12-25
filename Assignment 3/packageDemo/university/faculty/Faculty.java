package packageDemo.university.faculty;


import packageDemo.university.courses.Course;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private String facultyId;
    private List<Course> assignedCourses;

    public Faculty(String name, String facultyId) {
        this.name = name;
        this.facultyId = facultyId;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
        System.out.println(name + " has been assigned to teach the course: " + course.getCourseName());
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    @Override
    public String toString() {
        return "Faculty{" + "name='" + name + '\'' +", facultyId='" + facultyId +
               '\'' + ", assignedCourses=" + assignedCourses + '}';
    }
}

