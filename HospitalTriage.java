import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

class HospitalTriage {
    PriorityQueue<Patient> queue = new PriorityQueue<>((a, b) -> b.severity - a.severity);

    void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
    }

    void treatPatients() {
        while (!queue.isEmpty()) {
            System.out.println(queue.remove().name);
        }
    }

    public static void main(String[] args) {
        HospitalTriage obj = new HospitalTriage();
        obj.addPatient("John", 3);
        obj.addPatient("Alice", 5);
        obj.addPatient("Bob", 2);
        obj.treatPatients();
    }
}
