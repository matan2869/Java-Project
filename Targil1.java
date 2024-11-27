import java.util.Scanner;

public class Targil1 {
    public static void main(String[] args) {
        getBiggestAndSmallestNumber();


    }

    public static void getBiggestAndSmallestNumber (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("אנא קלוט מספר תלת ספרתי: ");

        int max = Integer.MIN_VALUE;
        int min = 100;



        while (true){
            int num = scanner.nextInt();

            if (num >=100 && num <=999){
                break;
            }

                if (num > max){
                    max = num;
                }

                if (num < min){
                    min = num;
                }

            }

        System.out.println("המספר הגדול ביותר שנקלט הוא "+max);
        System.out.println("המספר הקטן ביותר שנקלט הוא "+min);
            }

    }


