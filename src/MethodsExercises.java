import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Addition(1, 2) = " + Addition(1, 2));
        System.out.println("Subtraction(2, 3) = " + Subtraction(2, 3));
        System.out.println("Multiplication(4, 5) = " + Multiplication(4, 5));
        System.out.println("Division(5, 5) = " + Division(5, 5));
        System.out.println("Modulus(1, 2) = " + Modulus(1, 2));
        System.out.println("getInteger(1, 20) = " + getInteger(1, 20));


// END of main
    }

    public static int Addition(int num, int num2){
        return num + num2;

    }
    public static int Subtraction(int num, int num2){
        return num - num2;
    }
    public static int Multiplication(int num, int num2){
        return num * num2;
    }
    public static int Division(int num, int num2){
        return num / num2;
    }

    public static int Modulus(int num, int num2){
        return num % num2;
    }

    public static String getInteger(int min, int max){
        return "Enter a number between " + min + " and " + max;
    }



    //END of Class
}
