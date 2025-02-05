import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public String getName() {
        return name;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
    }
}
