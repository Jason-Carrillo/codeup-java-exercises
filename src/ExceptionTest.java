import util.Input;

public class ExceptionTest extends Input {

    public void main(String[] args){


    }



    public static void first(){
        System.out.println("open first");
second();
        System.out.println("end first");
    }

    public static void second(){
        System.out.println("open second");
        Danger();
        System.out.println("end second");
    }

    public static void Danger(){
        System.out.println("open third");

        System.out.println("end third");
        throw new IllegalArgumentException("Printing!");
    }


}
