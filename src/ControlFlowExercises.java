import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;

        int x = 0;

        int y = 100;

        long a = 2;

        while (i <= 15){
            System.out.println("i = " + i);
            i++;
        }

        do {
            System.out.println("x = " + x);
            x += 2;
        } while (
                x <= 100
        );

        do {
            System.out.println("y = " + y);
            y -= 5;
        } while (
                y >= -10
        );

        do {
            System.out.println("a = " + a);
            a *= a ;
        } while (
                a <= 1000000
        );

        for(int i = 5; i <= 15; i++){
            System.out.println("i = " + i);
        }

        for(int x = 0; x <= 100; x += 2){
            System.out.println("x = " + x);
        }

        for(int y = 100; y >= 0; y -= 2) {
            System.out.println("y = " + y);
        }

        for(long a = 2; a <= 1000000; a *= a) {
            System.out.println("a = " + a);
        }

        for(int b = 1; b <= 100; b++){
            if(b % 3 == 0 ){
                if (b % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                System.out.println("fizz");
                continue;
            } else if (b % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println("b = " + b);

        }

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("what number would you like to go up to?" + number);

        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | -----");


        for(int i = 1; i <= number; i++ ){
            System.out.println(i + "      |" + i*i + "        |" + i*i*i );
            if (i == number){

            }
        }

        System.out.println("Woud you like to continue? [Yes/No]");
        String confirm = scanner.next();

        System.out.println("Please pick a number from 0 to 100");
        int userNumber = scanner.nextInt();

        boolean accept = confirm.equalsIgnoreCase("YeS");

        if(accept = true){
            if (userNumber > 88) {
                System.out.println("A");
                System.out.println("Would you like to continue? [Yes/No]");
            } else if (userNumber > 80) {
                System.out.println("B");
                System.out.println("Would you like to continue? [Yes/No]");
            } else if (userNumber > 67) {
                System.out.println("C");
                System.out.println("Would you like to continue? [Yes/No]");
            } else if (userNumber > 60) {
                System.out.println("D");
                System.out.println("Would you like to continue? [Yes/No]");
            } else {
                System.out.println("F");
                System.out.println("Would you like to continue? [Yes/No]");
            }
        } else {
            System.out.println("Ok then");
        }














        // main closing tags
    }
}
