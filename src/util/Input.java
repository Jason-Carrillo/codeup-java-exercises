package util;

import java.util.Scanner;

public class Input {
    public Scanner scanner;

    public Input(){

        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }





    public int getInt(){


        return this.scanner.nextInt();
    }
    public double getDouble(){

        return this.scanner.nextDouble();
    }


    public boolean yesNo(){
        System.out.println("Would you like to continue? Yes/No");

        String input = this.scanner.nextLine();

        return input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d, and %d", min, max);

        String num = getString();

        int input = Integer.parseInt(num);

        if (input < min || input > max){
            getInt(min, max);
        }
        return input;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %s, and %s", min, max);
        String num = getString();

        double input = Double.parseDouble(num);
        try {

            if (input < min || input > max) {
                getDouble(min, max);
            }
            return input;

        } catch (ArithmeticException e) {
            getDouble(min, max);

        }
        return input;
    }


//    END of class
}
