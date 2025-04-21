public class ArmstrongNumber{
    public static void main(String[] args) {
        int number = 153; // Example number to check
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Count the number of digits

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise it to the power of the number of digits and add to sum
            number /= 10; // Remove the last digit
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}