package Kniffel.service;

import Kniffel.GameMode;
import Kniffel.scorecard.Scorecard;

import java.util.*;
import java.util.stream.Collectors;

public class DialoguePerformer
{
    public static List<String> askPlayerNames(int amountOfPlayers)
    {
        List<String> playerNames = new ArrayList<>();

        for (int i = 0; i < amountOfPlayers; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player " + (i + 1) + ", what is your name?");
            String name = scanner.nextLine();

            if (name.isEmpty())
                i--;
            else
                playerNames.add(name);
        }
        return playerNames;
    }

    public static int askAmountOfPlayers()
    {
        int amountOfPlayers;
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many players?");
            amountOfPlayers = scanner.nextInt();
        } while (amountOfPlayers < 1);

        return amountOfPlayers;
    }

    public static GameMode askGameMode()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which game mode do you want to play? (Kniffel / Yahtzee)");
        String gameMode = scanner.next();
        return GameMode.valueOf(gameMode.toUpperCase(Locale.ROOT));
    }

    public static boolean askPlayAgain()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again?");
        return scanner.nextBoolean();
    }

    public static List<Integer> getDiceKept()
    {
        System.out.println("Which dice to you want to keep?");
        Scanner scanner = new Scanner(System.in);
        String diceKept = scanner.nextLine();
        return Arrays.stream(diceKept.split(""))
                     .map(Integer::valueOf)
                     .collect(Collectors.toList());
    }

    public static String chooseCategoryToAddScore(Scorecard scorecard)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What category do you choose to add the score?");
        String category = scanner.nextLine();
        return category;
    }

    public static int askAmountOfRounds()
    {
        int amountOfRounds;
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many rounds?");
            amountOfRounds = scanner.nextInt();
        } while (amountOfRounds < 1);

        return amountOfRounds;
    }
}
