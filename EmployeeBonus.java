import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            salaries[i] = sc.nextDouble();
            yearsOfService[i] = sc.nextDouble();

            if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please re-enter details.");
                i--;
                continue;
            }

            if (yearsOfService[i] > 5) {
                bonuses[i] = 0.05 * salaries[i];
            } else {
                bonuses[i] = 0.02 * salaries[i];
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
