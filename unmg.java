public class unmg {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public unmg(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public void modifyCGPA(double newCGPA) {
        CGPA = newCGPA;
    }

    class PostgraduateStudent extends unmg {
        private String specialization;

        public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
            super(rollNumber, name, CGPA);
            this.specialization = specialization;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Specialization: " + specialization);
        }
    }

    public static void main(String[] args) {
        unmg u1 = new unmg(101, "John", 8.5);
        unmg u2 = u1.new PostgraduateStudent(102, "Jane", 9.0, "Computer Science");
        u1.displayDetails();
        u2.displayDetails();
    }

}
