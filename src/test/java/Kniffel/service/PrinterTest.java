package Kniffel.service;

import Kniffel.Game;
import Kniffel.GameMode;
import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.scorecards.KniffelScorecard;
import Kniffel.scorecard.scorecards.KniffelScorecardBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;
// TODO

class PrinterTest
{


    @Test
    void printScoreCard() throws Exception
    {
        Game.setGameMode(GameMode.KNIFFEL);
        Game.setAmountOfRounds(1);

        KniffelScorecard kniffelScorecard = new KniffelScorecardBuilder().setPlayerName("Ramy").build();
        Scorecard kniffelScorecardCopy = kniffelScorecard.duplicateWithDifferentNameAndEmptyPoints("Karim");

        kniffelScorecardCopy.getPointsColumns().get(0).getPointsBoxes().get(0).setPoints(40);

        Printer.printScoreCard(kniffelScorecard);
    }

    @Test
    void printWinner() throws Exception
    {
        Game.setGameMode(GameMode.KNIFFEL);
        Game.setAmountOfRounds(1);

        KniffelScorecard kniffelScorecard = new KniffelScorecardBuilder().setPlayerName("Ramy").build();
        Scorecard kniffelScorecardCopy = kniffelScorecard.duplicateWithDifferentNameAndEmptyPoints("Karim");

        kniffelScorecardCopy.getPointsColumns().get(0).getPointsBoxes().get(0).setPoints(40);

        Game.setScorecards(List.of(kniffelScorecard, kniffelScorecardCopy));

        Printer.printWinner();
    }
}