import java.util.Scanner;

public class RockPaperScissors {
    static void main() {
        // declarations
        String playerA;
        String playerB;
        String playAgain;

        Scanner in = new Scanner(System.in);
        do {
            do {
                System.out.print("Player A's Move (R,P,S)");
                playerA = in.next();

                if (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S")) {
                    System.out.println("Invalid input. Please try again.");
                }
            } while (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S"));
            do {
                System.out.print("Player B's Move (R,P,S)");
                playerB = in.next();

                if (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S")) {
                    System.out.println("Invalid input. Please try again.");
                }
            } while (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S"));
            if(playerA.equals("R") && playerB.equals("R")) {
                System.out.println("Rock Vs. Rock, it's a Tie!");
            } else if (playerA.equals("R") && playerB.equals("S")) {
                System.out.println("Rock breaks Scissors, Player A Wins!");
            } else if (playerA.equals("S") && playerB.equals("R")) {
                System.out.println("Rock breaks Scissors, Player B Wins!");
            } else if (playerA.equals("S") && playerB.equals("S")) {
                System.out.println("Scissors Vs. Scissors, it's a Tie!");
            } else if (playerA.equals("S") && playerB.equals("P")) {
                System.out.println("Scissors cuts Paper, Player A Wins!");
            } else if (playerA.equals("P") && playerB.equals("S")) {
                System.out.println("Scissors cuts Paper, Player B Wins!");
            } else if (playerA.equals("P") && playerB.equals("P")) {
                System.out.println("Paper Vs. Paper, it's a Tie!");
            } else if (playerA.equals("P") && playerB.equals("R")) {
                System.out.println("Paper covers Rock, Player A Wins!");
            } else if (playerA.equals("R") && playerB.equals("P")) {
                System.out.println("Paper covers Rock, Player B Wins!");
            }
            System.out.println("Play Again? [Y/N]");
            playAgain = in.next();



        } while(playAgain.equals("Y"));
        if (playAgain.equals("N")); {
            System.out.println("Thanks for Playing!");
        }
    }
}
