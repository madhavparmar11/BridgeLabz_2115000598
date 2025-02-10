abstract class Employee {
    private int employeeId;
    private int baseSalary;
    private String name;

    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public int getBaseSalary() { return baseSalary; }

    public abstract int calculateSalary();

    public void displayDetails() {
        System.out.println(employeeId + " " + name + " " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public int calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private int hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = { new FullTimeEmployee(1, "John", 5000), new PartTimeEmployee(2, "Alice", 20, 100) };
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
