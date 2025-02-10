abstract class Vehicle {
    private int vehicleId;
    private int ratePerKm;
    private String driverName;

    public Vehicle(int vehicleId, String driverName, int ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public int getRatePerKm() { return ratePerKm; }

    public abstract int calculateFare(int distance);

    public void getVehicleDetails() {
        System.out.println(vehicleId + " " + driverName + " " + calculateFare(10));
    }
}

class Car extends Vehicle {
    public Car(int vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    public int calculateFare(int distance) { return distance * getRatePerKm(); }
}

class Bike extends Vehicle {
    public Bike(int vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    public int calculateFare(int distance) { return distance * getRatePerKm(); }
}

interface GPS {
    int getCurrentLocation();
    void updateLocation(int location);
}

public class RideHailingSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = { 
            new Car(1, "Tom", 15), 
            new Bike(2, "Jerry", 5) 
        };
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
        }
    }
}
