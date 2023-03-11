import java.util.Scanner;

public class GuessMan {
    public static void main(String[] args) {

        Man();


    }

    public static void Man() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001b[38;5;85m RANGE OF NUMBERS >>> ");
        System.out.print(" from: ");
        int a = scanner.nextInt();

        System.out.print(" to: ");
        int b = scanner.nextInt();

        int count = 1;


        while (true) {

            int myanswer = (a + b) / 2;

            System.out.println(" \u001b[38;5;85m Is this number " + (a + b) / 2 + "?");
            System.out.println(" yes / great / less");
            scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println(" I found " + count + " attempt ");
                System.out.println(" The number was " + myanswer);
                break;

            } else if (answer.equalsIgnoreCase("great")) {
                a = (a + b) / 2;
                count++;

            } else if (answer.equalsIgnoreCase("less")) {
                b = (a + b) / 2;
                count++;
            }

        }
    }
}
