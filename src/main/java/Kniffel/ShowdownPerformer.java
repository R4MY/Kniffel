package Kniffel;

import Kniffel.scorecard.Scorecard;
import Kniffel.service.CheckpointPerformer;
import Kniffel.service.PointsCalculator;
import Kniffel.service.Printer;

public class ShowdownPerformer
{
    public static void perform()
    {
        for (Scorecard scorecard : Game.getScorecards())
        {
            Printer.printScoreCard(scorecard);
            PointsCalculator.addPointsToCategory(scorecard, "Total of Upper Section without Bonus");
            CheckpointPerformer.perform();
            PointsCalculator.addPointsToCategory(scorecard, "Total of Upper Section");
            Printer.printScoreCard(scorecard);
            CheckpointPerformer.perform();
            PointsCalculator.addPointsToCategory(scorecard, "Total of Lower Section");
            Printer.printScoreCard(scorecard);
            CheckpointPerformer.perform();
            PointsCalculator.addPointsToCategory(scorecard, "Grand Total");
            Printer.printScoreCard(scorecard);
            CheckpointPerformer.perform();
        }

        for (Scorecard scorecard : Game.getScorecards())
            Printer.printScoreCard(scorecard);

        Printer.printWinner();
    }
}
