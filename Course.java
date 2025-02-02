public class Course {
    public static String instituteName = "XYZ Institute"; // Class variable
    private String courseName;
    private int duration;
    private double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 1500);
        Course course2 = new Course("Data Science", 12, 3000);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating institute name for all courses
        Course.updateInstituteName("ABC Institute");

        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
