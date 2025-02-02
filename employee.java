public class employee {
    public int employeeid;
    protected String department;
    private double salary;

    public employee(int employeeid, String department, double salary) {
        this.employeeid = employeeid;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Updated Salary: " + this.salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    class Manager extends employee {
        public Manager(int employeeid, String department, double salary) {
            super(employeeid, department, salary);
        }

        @Override
        public void displayDetails() {
            System.out.println("Manager Employee ID: " + employeeid);
            System.out.println("Manager Department: " + department);
            System.out.println("Manager Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        employee e1 = new employee(101, "HR", 8000);
        employee.Manager m1 = e1.new Manager(102, "IT", 8500);
        e1.displayDetails();
        m1.displayDetails();
        e1.modifySalary(8100);
    }
}
