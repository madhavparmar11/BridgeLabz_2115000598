import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }

    // Method to check if the OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) {
                return false; // Duplicate OTP found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        Random rand = new Random();

        // Generating 10 unique OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs: ");
        for (int otp : otpArray) {
            System.out.print(otp + " ");
        }

        System.out.println("\nAre OTPs unique? " + areOTPsUnique(otpArray));
    }
}
