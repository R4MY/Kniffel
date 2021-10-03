package Kniffel.service;

import Kniffel.Game;
import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.pointsColumn.PointsBox;

public class Printer
{
    public static void printScoreCard(Scorecard scorecard)
    {
        System.out.println(Game.getGameMode() + "    Name: " + scorecard.getPlayerName());

        for (PointsBox pointsBox : scorecard.getPointsColumns().get(0).getPointsBoxes())
        {
            System.out.println(pointsBox.getBox().getCategory() + ": " + pointsBox.getPoints());
        }
    }

    public static void printWinner()
    {
        Scorecard maxGrandTotalScorecard = Game.getScorecards().get(0);

        for (Scorecard scorecard : Game.getScorecards())
        {
            if (PointsCalculator.getGrandTotal(scorecard) > PointsCalculator.getGrandTotal(maxGrandTotalScorecard))
                maxGrandTotalScorecard = scorecard;
        }

        System.out.println("\n\n... and the winner is: " + maxGrandTotalScorecard.getPlayerName()
                                   + "with " + PointsCalculator.getGrandTotal(maxGrandTotalScorecard)
                                   + " points!!! \n Congratulations!");
    }
}
