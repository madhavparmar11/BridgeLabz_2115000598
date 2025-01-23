import java.util.Scanner;

public class LeapYearChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println(isLeapYearSingleCondition(year));
    }

    public static String isLeapYearSingleCondition(int year) {
        if (year < 1582) {
            return "Year is not in the Gregorian calendar.";
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " is a Leap Year.";
        } else {
            return year + " is not a Leap Year.";
        }
    }
}
