package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        return this.scanner.nextLine();
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public boolean yesNo(){
        System.out.println("Would you like to conitnue? Yes/No");

        String input = this.getString();

        return input.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max){
        System.out.printf("Enter a number between %d, and %d", min, max);

        int input = this.getInt();

        if (input < min || input > max){
            getInt(min, max);
        }
        return input;
    }


//    END of class
}
