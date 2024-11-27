import java.util.Arrays;

public class Targil3 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,-4,-5,-6};
        isBalancedArray(numbers);

    }

    public static void isBalancedArray(int[] arr) {


        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                evenCount++;
            }
            if (arr[i] < 0) {
                oddCount++;
            }
        }

        if (evenCount == oddCount) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = arr.length-1; i>=0; i--){
                System.out.print(arr[i]);
                }
            }
        }

    }