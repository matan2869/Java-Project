public class Targil9 {
    public static void main(String[] args) {

        int num1 = 123;
        int num2 = 12345;
        int num3 = 18;
        int num4 = 9;

        System.out.println("Net weight of " + num1 + " is: " + calculateNetWeight(num1)); // Output: 2
        System.out.println("Net weight of " + num2 + " is: " + calculateNetWeight(num2)); // Output: 9
        System.out.println("Net weight of " + num3 + " is: " + calculateNetWeight(num3)); // Output: 0
        System.out.println("Net weight of " + num4 + " is: " + calculateNetWeight(num4)); // Output: 0

        System.out.println("--------------------------------------");

        System.out.println("Net weight of " + num1 + " is: " + calculateNetWeight2(num1)); // Output: 2
        System.out.println("Net weight of " + num2 + " is: " + calculateNetWeight2(num2)); // Output: 9
        System.out.println("Net weight of " + num3 + " is: " + calculateNetWeight2(num3)); // Output: 0
        System.out.println("Net weight of " + num4 + " is: " + calculateNetWeight2(num4)); // Output: 0





    }

    public static int calculateNetWeight(int number){
        String numStr = Integer.toString(number);

        if (numStr.length() <= 2){
            return 0;
        }

        String middleDigits = numStr.substring(1, numStr.length() -1);

        int sum = 0;
        for (char digit: middleDigits.toCharArray()){
            sum += Character.getNumericValue(digit);
        }

        return sum;

    }

    public static int calculateNetWeight2(int number) {
        if (number < 10) {
            return 0; // If the number has only one digit, the net weight is 0
        }

        int sum = 0;
        int divisor = 10;

        // Remove the rightmost digit
        int trimmedNumber = number / 10;

        // Calculate the highest power of 10 less than the number
        while (trimmedNumber / divisor >= 10) {
            divisor *= 10;
        }

        // Add the digits except the leftmost and rightmost
        while (divisor >= 10) {
            sum += trimmedNumber / divisor;
            trimmedNumber %= divisor;
            divisor /= 10;
        }

        return sum;
    }

}