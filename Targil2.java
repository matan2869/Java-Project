import java.util.Scanner;

public class Targil2 {
    public static void main(String[] args) {

        String s = "hahah";

        System.out.println(isValidString(s));
        System.out.println();
        printValidStrings();

    }

    public static boolean isValidString (String str){

        if (str.length() % 2 == 0){
            return false;
        }

        if (str.charAt(0) == str.charAt(str.length()-1) && str.charAt(0) == str.charAt(str.length() / 2)){
            return true;
        }

        return false;


    }

    public static void printValidStrings (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("אנא הכנס מחרוזות:");

        int count = 0;

        String [] str = new  String[4];

        for (int i=0; i<str.length; i++){

            str[i] = scanner.nextLine();

            if (isValidString(str[i])){
                count++;

            }
        }
        System.out.println(count);

            }
        }
