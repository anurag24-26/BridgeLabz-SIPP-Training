package Strings;
import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return "user";
        return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games;
        int userWins = 0, compWins = 0;

        System.out.print("Enter number of games: ");
        games = sc.nextInt();

        System.out.printf("%-10s %-10s %-10s\n", "Game", "User", "Computer");

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String result = getWinner(user, comp);

            if (result.equals("user")) userWins++;
            else if (result.equals("computer")) compWins++;

            System.out.printf("%-10d %-10s %-10s\n", i, user, comp);
        }

        System.out.println("\n--- Summary ---");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + (games - userWins - compWins));
        System.out.println("User Win %: " + (userWins * 100.0 / games) + "%");
        System.out.println("Computer Win %: " + (compWins * 100.0 / games) + "%");
    }
}
