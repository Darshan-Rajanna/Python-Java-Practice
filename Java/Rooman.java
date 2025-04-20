public class Rooman {

    public static void main(String[] args) {
        Rooman solution = new Rooman();
        String roman = "IV"; // Example input
        int result = solution.romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result); // Output: 1994
    }
    
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = getRomanValue(c);

            if (value < prevValue) {
                total -= value; // Subtract if the current value is less than the previous value
            } else {
                total += value; // Add otherwise
            }
            prevValue = value; // Update the previous value
        }

        return total;
    }
    


    private int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + c);
        }
    }

}