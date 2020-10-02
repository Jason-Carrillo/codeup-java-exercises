import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell Bob Something...");

        String userInput = scanner.nextLine();

        if (userInput.equals("")){
            System.out.println("Bob: Fine. Be that way!");
        } else if (userInput.charAt(userInput.length()-1) == '!'){
            System.out.println("Bob: Whoa, chill out!");
        } else if (userInput.charAt(userInput.length()-1) == '?'){
        System.out.println(userInput.charAt(userInput.length()-1));
        System.out.println("Bob: Sure.");
        } else {
            System.out.println("Bob: Whatever.");
        }


        // end of Main
    }
}
