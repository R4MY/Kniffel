package Kniffel;

import Kniffel.scorecard.Scorecard;
import Kniffel.service.Roller;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// TODO: Whole class
public class TurnHandler
{
    private static String diceKeep;
    private static String chooseCategory;

    public TurnHandler(@Value("${dialogues.diceKeep}") String diceKeep,
                       @Value("${dialogues.chooseCategory}") String chooseCategory)
    {
        TurnHandler.diceKeep = diceKeep;
        TurnHandler.chooseCategory = chooseCategory;
    }

    static Scorecard takeTurn(Scorecard scorecard)
    {
        List<Integer> currentThrow = Roller.rollAll();
        displayThrow(currentThrow);
        rerollThrow(currentThrow);
        displayThrow(currentThrow);
        rerollThrow(currentThrow);
        displayThrow(currentThrow);

        return chooseCategoryAndAddScore(scorecard);
    }

    private static void displayThrow(List<Integer> currentThrow)
    {
        System.out.println(currentThrow.toString());
    }

    private static void rerollThrow(List<Integer> currentThrow)
    {
        List<Integer> diceKept = getDiceKept();

        if (diceKept.size() != currentThrow.size())
        {
            Roller.rerollChosenDice(currentThrow, diceKept);
        }
    }

    private static List<Integer> getDiceKept()
    {
        System.out.println(diceKeep);
        Scanner scanner = new Scanner(System.in);
        return new ArrayList<>();
    }

    private static Scorecard chooseCategoryAndAddScore(Scorecard scorecard)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(chooseCategory);
        return scorecard;
    }
}
