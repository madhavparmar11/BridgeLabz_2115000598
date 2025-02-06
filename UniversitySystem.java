import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            System.out.println("  - " + dept.getName());
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("  - " + faculty.getName());
        }
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University university = new University("Global University");

        Department csDepartment = new Department("Computer Science");
        Department bioDepartment = new Department("Biology");

        Faculty professor1 = new Faculty("Dr. Smith");
        Faculty professor2 = new Faculty("Dr. Johnson");

        university.addDepartment(csDepartment);
        university.addDepartment(bioDepartment);

        university.addFaculty(professor1);
        university.addFaculty(professor2);

        university.displayDetails();
    }
}
