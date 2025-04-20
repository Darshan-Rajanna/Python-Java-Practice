public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        else if (x < 10) {
            return true; // Single-digit numbers are palindromes
        }

        else if (x == 0) {
            return true; // 0 is a palindrome
        }

        else if (x % 10 == 0) {
            return false; // Numbers ending with 0 (except 0 itself) are not palindromes
        }

        else {
            int reversed = 0;
            int y = x; // Store the original number for comparison
            while (x != 0) {

                // get last digit from num
                int digit = x % 10;
                reversed = reversed * 10 + digit;

                // remove the last digit from num
                x /= 10;
            }
            if (y == reversed) { // Compare the original number with the reversed number
                return true; // The number is a palindrome
            } else {
                return false; // The number is not a palindrome
            }
        }   
        // else{

        //     int y=x;
        //     String numbeString= Integer.toString(x);
        //     StringBuilder sb = new StringBuilder(numbeString);

        //     char[] charArray = sb.toString().toCharArray();
        //     int i=0;
        //     int j=charArray.length-1;
        //     while(i<j/2){
        //         if(charArray[i]!=charArray[j]){
        //             return false; // The number is not a palindrome
        //         }
        //         i++;
        //         j--;
        //     }
        // }
    }

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        int x = 88888; // Example input
        boolean result = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result); // Output: true
        x = -121; // Example input
        result = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result); // Output: false
    }

}
