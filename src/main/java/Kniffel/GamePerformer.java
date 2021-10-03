package Kniffel;

import Kniffel.scorecard.Scorecard;
import Kniffel.service.CheckpointPerformer;
import Kniffel.service.DialoguePerformer;
import Kniffel.service.Printer;
import org.springframework.stereotype.Service;

@Service
public class GamePerformer
{
    public static void perform() throws Exception
    {
        GameArchitect.createGame();

        do
        {
            do
            {
                for (int i = 0; i < Game.getAmountOfTurns(); i++)
                {
                    for (Scorecard scorecard : Game.getScorecards())
                    {
                        Printer.printScoreCard(scorecard);
                        TurnHandler.takeTurn(scorecard);
                        Printer.printScoreCard(scorecard);
                        CheckpointPerformer.perform();
//                    Game.nextPlayersTurn();
                    }
                }

                ShowdownPerformer.perform();
            } while (Game.getCurrentRound() < Game.getAmountOfRounds());
        } while (DialoguePerformer.askPlayAgain());
    }
}
