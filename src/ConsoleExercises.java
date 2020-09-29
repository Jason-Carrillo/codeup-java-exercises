import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f \n", pi);
//
//
//
//        int inputNumber = scanner.nextInt();
//
//        System.out.println(inputNumber);
//
//        String word1 = scanner.next();
//
//        String word2 = scanner.next();
//
//        String word3 = scanner.next();
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        String sentence = scanner.nextLine();
//
//        System.out.println(sentence);

        String length = scanner.nextLine();
        String width = scanner.nextLine();

        int number  = parseInt(length);

        int number2 = parseInt(width);

        System.out.println((number * 2) + (number2 *2));

        int iLength = scanner.nextInt();

        int iWidth = scanner.nextInt();

        System.out.println((iLength * 2) + (iWidth *2));


    }
}
