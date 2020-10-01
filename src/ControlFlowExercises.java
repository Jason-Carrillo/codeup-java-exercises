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

        for(int y = 100; y >= 0; y -= 2)
            System.out.println("y = " + y);
    }
}
