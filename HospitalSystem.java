abstract class Patient {
    private int patientId;
    private int age;
    private String name;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract int calculateBill();

    public void getPatientDetails() {
        System.out.println(patientId + " " + name + " " + calculateBill());
    }
}

class InPatient extends Patient {
    private int dailyCharge;
    private int days;

    public InPatient(int patientId, String name, int age, int dailyCharge, int days) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.days = days;
    }

    public int calculateBill() { return dailyCharge * days; }
}

class OutPatient extends Patient {
    private int consultationFee;

    public OutPatient(int patientId, String name, int age, int consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public int calculateBill() { return consultationFee; }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient[] patients = { 
            new InPatient(1, "Mike", 40, 1000, 5), 
            new OutPatient(2, "Anna", 30, 500) 
        };
        for (Patient p : patients) {
            p.getPatientDetails();
        }
    }
}
