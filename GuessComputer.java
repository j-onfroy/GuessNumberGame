import java.util.Random;
import java.util.Scanner;

public class GuessComputer {
    public static void main(String[] args) {

        computer();


    }

    public static void computer() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\u001b[38;5;83m RANGE OF NUMBERS>>> ");
        System.out.print("from: ");
        int a = scanner.nextInt();

        System.out.print("to: ");
        int b = scanner.nextInt();

        int guessNumber = random.nextInt(a,b);
        int count = 1;

        System.out.println("\u001b[38;5;83m Find the Number I think: ");
        int yourguess = scanner.nextInt();
        while(true){
            if(yourguess==guessNumber){
                System.out.println(" You found in " + count + " attempt 🎉");
                System.out.println(" The number was " + guessNumber);
                break;
            } else if (yourguess>guessNumber) {
                System.out.println("The number is less than " + yourguess);
                System.out.println(" Try again: ");
                yourguess = scanner.nextInt();
                count++;
            } else if (yourguess<guessNumber) {
                System.out.println("The number is great than " + yourguess);
                System.out.println(" Try again: ");
                yourguess = scanner.nextInt();
                count++;
            }
        }
    }
}
