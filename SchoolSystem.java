import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("  Enrolled in: " + course.getName());
        }
    }
}

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name);
        for (Student student : students) {
            System.out.println("  Student: " + student.name);
        }
    }

    public String getName() {
        return name;
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Springfield High");
        Student student1 = new Student("John");
        Student student2 = new Student("Emma");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        student1.enrollCourse(math);
        student1.enrollCourse(science);
        student2.enrollCourse(math);

        student1.viewCourses();
        student2.viewCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
