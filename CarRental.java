public class CarRental {
    String customername;
    String carmodel;
    int rentaldays;

    CarRental(String customername, String carmodel, int rentaldays) {
        this.customername = customername;
        this.carmodel = carmodel;
        this.rentaldays = rentaldays;
    }

    public void totalcost() {
        int cost = 0;
        if (carmodel.equals("Sedan")) {
            cost = 50 * rentaldays;
        } else if (carmodel.equals("SUV")) {
            cost = 100 * rentaldays;
        } else if (carmodel.equals("Luxury")) {
            cost = 150 * rentaldays;
        }
        System.out.println("Customer Name: " + customername);
        System.out.println("Car Model: " + carmodel);
        System.out.println("Rental Days: " + rentaldays);
        System.out.println("Total Cost: " + cost);
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental("Alice", "Sedan", 5);
        CarRental c2 = new CarRental("Bob", "SUV", 3);
        CarRental c3 = new CarRental("Charlie", "Luxury", 2);
        c1.totalcost();
        c2.totalcost();
        c3.totalcost();
    }

}
