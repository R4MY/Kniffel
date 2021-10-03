package Kniffel.scorecard.scorecards;

import Kniffel.Game;
import Kniffel.GameMode;
import Kniffel.scorecard.Scorecard;
import Kniffel.service.Printer;
import org.junit.jupiter.api.Test;

    class KniffelScorecardBuilderTest
{
    @Test
    void build()
    {
        KniffelScorecard kniffelScorecard = new KniffelScorecardBuilder().build();
        System.out.println(kniffelScorecard);
    }

    @Test
    void duplicate() throws Exception
    {
        Game.setGameMode(GameMode.KNIFFEL);
        Game.setAmountOfRounds(1);

        KniffelScorecard kniffelScorecard = new KniffelScorecardBuilder().setPlayerName("Ramy").build();
        Scorecard kniffelScorecardCopy = kniffelScorecard.duplicateWithDifferentNameAndEmptyPoints("Karim");

        kniffelScorecardCopy.getPointsColumns().get(0).getPointsBoxes().get(0).setPoints(40);

        System.out.println(kniffelScorecard);
        System.out.println(kniffelScorecardCopy);
    }

    @Test
    void print() throws Exception
    {
        Game.setGameMode(GameMode.KNIFFEL);
        Game.setAmountOfRounds(1);

        KniffelScorecard kniffelScorecard = new KniffelScorecardBuilder().setPlayerName("Ramy").build();

        Printer.printScoreCard(kniffelScorecard);
    }

    @Test
    void showdown() throws Exception
    {
        Game.setGameMode(GameMode.KNIFFEL);
        Game.setAmountOfRounds(1);

        KniffelScorecard kniffelScorecard = new KniffelScorecardBuilder().setPlayerName("Ramy").build();

    }
}