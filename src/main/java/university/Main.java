package university;

public class Main {
    public static void main(String[] args) {
    Student student = new Student();
    student.studentID = 101;
    student.name = "Mg Mg";

    Course course = new Course();
    course.courseId = 1;
    course.courseName = "Introduction of Computer Science";

    Enrollment enrollment = new Enrollment();
    enrollment.student = student;
    enrollment.course = course;

    System.out.println("Student ID: " + enrollment.student.studentID + ", Name: " + enrollment.student.name);
    System.out.println("Course ID: " + enrollment.course.courseId + ", Name: " + enrollment.course.courseName);

    }
}
