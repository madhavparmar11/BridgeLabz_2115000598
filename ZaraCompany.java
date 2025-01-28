import java.util.Random;

public class ZaraCompany {

    // Method to determine the salary and years of service
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numberOfEmployees][2]; // [0] for salary, [1] for years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int yearsOfService = rand.nextInt(20); // Random years of service (0-19)
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] resultData = new double[employeeData.length][3]; // [0] for old salary, [1] for new salary, [2] for
                                                                    // bonus

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = (yearsOfService >= 5) ? 0.05 * oldSalary : 0.02 * oldSalary;
            double newSalary = oldSalary + bonus;

            resultData[i][0] = oldSalary;
            resultData[i][1] = newSalary;
            resultData[i][2] = bonus;
        }
        return resultData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateTotalBonus(double[][] resultData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < resultData.length; i++) {
            totalOldSalary += resultData[i][0];
            totalNewSalary += resultData[i][1];
            totalBonus += resultData[i][2];
        }

        System.out.println("Employee Salary Report:");
        System.out.println("----------------------------------------------------");
        System.out.println("Old Salary\tNew Salary\tBonus");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < resultData.length; i++) {
            System.out.printf("%d\t\t%.2f\t%.2f\n", (int) resultData[i][0], resultData[i][1], resultData[i][2]);
        }

        System.out.println("----------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    // Main method to run the Zara Company Bonus Program
    public static void main(String[] args) {
        int numberOfEmployees = 10;
        int[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] resultData = calculateBonus(employeeData);
        calculateTotalBonus(resultData);
    }
}
