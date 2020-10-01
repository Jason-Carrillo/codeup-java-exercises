public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;

        while (i <= 15){
            System.out.println("i = " + i);
            i++;
        }

        int x = 0;

        int y = 100;

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



    }
}
