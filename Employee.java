class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Designation: " + this.designation);
        } else {
            System.out.println("Invalid employee instance.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Data Analyst");
        
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        
        Employee.displayTotalEmployees();
    }
}
