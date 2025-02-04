class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Name: " + this.name);
            System.out.println("Grade: " + this.grade);
        } else {
            System.out.println("Invalid student instance.");
        }
    }

    public static void main(String[] args) {
        Student stu1 = new Student("Alice", 101, "A");
        Student stu2 = new Student("Bob", 102, "B");
        
        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
        
        Student.displayTotalStudents();
    }
}
