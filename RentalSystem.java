abstract class Vehicle {
    private int rentalRate;
    private String vehicleNumber;
    private String type;

    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract int calculateRentalCost(int days);
}

class Car extends Vehicle {
    public Car(String vehicleNumber, int rentalRate) { super(vehicleNumber, "Car", rentalRate); }
    public int calculateRentalCost(int days) { return days * 50; }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, int rentalRate) { super(vehicleNumber, "Bike", rentalRate); }
    public int calculateRentalCost(int days) { return days * 20; }
}

interface Insurable {
    int calculateInsurance();
}

class RentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car("ABC123", 50), new Bike("XYZ789", 20) };
        for (Vehicle v : vehicles) {
            System.out.println(v.calculateRentalCost(5));
        }
    }
}
