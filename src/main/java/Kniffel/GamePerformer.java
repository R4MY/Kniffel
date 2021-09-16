package Kniffel;

import Kniffel.scorecard.Scorecard;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class GamePerformer
{
    private final int roundsAmount;
    private final String playAgainMessage;

    public GamePerformer(@Value("${roundsAmount}") int roundsAmount,
                         @Value("${dialogues.playAgain}") String playAgainMessage)
    {
        this.roundsAmount = roundsAmount;
        this.playAgainMessage = playAgainMessage;
    }

    public boolean performGame()
    {
        for (int i = 0; i < roundsAmount; i++)
        {
            for (Scorecard scorecard : Game.getScorecards())
            {
                scorecard = TurnHandler.takeTurn(scorecard);
            }
        }
        return getPlayAgain(); // return wants to play again
    }

    private void createScorecards()
    {
    }

    private boolean getPlayAgain()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(playAgainMessage);
        return scanner.nextBoolean();
    }
}
