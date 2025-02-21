import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private int id;
    private String name, department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + department + " | " + salary);
    }
}

public class EmployeeSerializer {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 60000),
            new Employee(2, "Bob", "HR", 50000)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving employees.");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> savedEmployees = (List<Employee>) ois.readObject();
            savedEmployees.forEach(Employee::display);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees.");
        }
    }
}
