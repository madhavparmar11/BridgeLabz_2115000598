import java.util.Scanner;

public class main8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the city you are traveling from: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken (in hours): ");
        double time = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / time;

        System.out.println("Traveler: " + name);
        System.out.println("Travel Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Speed: " + speed + " miles per hour");
    }

}
