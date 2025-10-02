import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String move;

        do
        {
            // Get Player A move
            String playerA;
            do
            {
                System.out.print("Player A, enter your move (R, P, or S): ");
                playerA = sc.nextLine().trim();
                if (!(playerA.equalsIgnoreCase("R") ||
                        playerA.equalsIgnoreCase("P") ||
                        playerA.equalsIgnoreCase("S")))
                {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            }
            while (!(playerA.equalsIgnoreCase("R") ||
                    playerA.equalsIgnoreCase("P") ||
                    playerA.equalsIgnoreCase("S")));

            // Get Player B move
            String playerB;
            do
            {
                System.out.print("Player B, enter your move (R, P, or S): ");
                playerB = sc.nextLine().trim();
                if (!(playerB.equalsIgnoreCase("R") ||
                        playerB.equalsIgnoreCase("P") ||
                        playerB.equalsIgnoreCase("S")))
                {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            }
            while (!(playerB.equalsIgnoreCase("R") ||
                    playerB.equalsIgnoreCase("P") ||
                    playerB.equalsIgnoreCase("S")));

            // Determine winner
            if (playerA.equalsIgnoreCase(playerB))
            {
                System.out.println(playerA.toUpperCase() + " vs " + playerB.toUpperCase() + " → It’s a Tie!");
            }
            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors – Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper – Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock – Player A wins!");
            }
            else if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors – Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper – Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock – Player B wins!");
            }

            // Play again prompt
            System.out.print("Do you want to play again? [Y/N]: ");
            move = sc.nextLine().trim();

        }
        while (move.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
