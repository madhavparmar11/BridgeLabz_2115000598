class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + this.patientID);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
        } else {
            System.out.println("Invalid patient instance.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "XYZ789");
        
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
        Vehicle.updateRegistrationFee(600.0);
        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
        Patient patient1 = new Patient("Alice", 30, "Flu", 101);
        Patient patient2 = new Patient("Bob", 45, "Fracture", 102);
        
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        
        Patient.getTotalPatients();
    }
}