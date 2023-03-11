import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Let's think of a number and try to find this number 😊");
        int numberofgame = 0;
        while(true){
            System.out.println(" Who starts? I / You  ");
            String who = scanner.nextLine();
            if(who.equalsIgnoreCase("i")){
                GuessMan.Man();
                numberofgame++;
            } else if (who.equalsIgnoreCase("you")) {
                GuessComputer.computer();
                numberofgame++;
            }
            System.out.println(" We play again? yes / no");
            String weplayagain = scanner.nextLine();
            if(weplayagain.equalsIgnoreCase("no")) break;
        }
        System.out.println(" We played " + numberofgame + " time ");

    }
}
