import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        int x = 0;
//
//        int y = 100;
//
//        long a = 2;

//        while (i <= 15){
//            System.out.println("i = " + i);
//            i++;
//        }

//        do {
//            System.out.println("x = " + x);
//            x += 2;
//        } while (
//                x <= 100
//        );
//
//        do {
//            System.out.println("y = " + y);
//            y -= 5;
//        } while (
//                y >= -10
//        );
//
//        do {
//            System.out.println("a = " + a);
//            a *= a ;
//        } while (
//                a <= 1000000
//        );

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

        System.out.println(number);









        // main closing tags
    }
}
