package Kniffel;

import Kniffel.scorecard.Scorecard;
import Kniffel.service.DialoguePerformer;
import Kniffel.service.PointsCalculator;
import Kniffel.service.Roller;

import java.util.List;
public class TurnHandler
{
    static void takeTurn(Scorecard scorecard) throws Exception
    {
        List<Integer> currentThrow = Roller.rollAll();
        displayThrow(currentThrow);
        rerollThrow(currentThrow);
        displayThrow(currentThrow);
        rerollThrow(currentThrow);
        displayThrow(currentThrow);

        String category;
        do
        {
            category = DialoguePerformer.chooseCategoryToAddScore(scorecard);
        } while (!PointsCalculator.addPointsToCategory(scorecard, category, currentThrow));
    }

    private static void displayThrow(List<Integer> currentThrow)
    {
        System.out.println(currentThrow.toString());
    }

    private static void rerollThrow(List<Integer> currentThrow) throws Exception
    {
        List<Integer> diceKept = DialoguePerformer.getDiceKept();

        if (diceKept.isEmpty())
            currentThrow = Roller.rollAll();
        else
        {
            int diceKeptSize = diceKept.size();
            int currentThrowSize = currentThrow.size();
            if (diceKeptSize != currentThrowSize)
            {
                if (diceKeptSize < currentThrowSize)
                    Roller.keepChosenDice(currentThrow, diceKept);
                else
                    throw new Exception();
            }
        }
    }
}
