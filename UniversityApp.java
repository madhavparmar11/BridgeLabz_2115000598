import java.util.*;

class Course {
    private String name;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class Professor {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Student student = new Student("John");
        Professor professor = new Professor("Dr. Smith");
        Course course = new Course("Data Structures");

        student.enrollCourse(course);
        professor.assignCourse(course);

        System.out.println(student.getName() + " enrolled in " + course.getName());
        System.out.println(professor.getName() + " teaches " + course.getName());
    }
}
