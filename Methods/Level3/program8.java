public class OTPGenerator {

    // Generate 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Check uniqueness
    public static boolean areUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTP 10 times
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate uniqueness
        if (areUnique(otps)) {
            System.out.println("All OTPs are Unique.");
        } else {
            System.out.println("Duplicate OTP Found.");
        }
    }
}