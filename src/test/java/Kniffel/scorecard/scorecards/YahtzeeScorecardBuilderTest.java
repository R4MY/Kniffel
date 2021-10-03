package Kniffel.scorecard.scorecards;

import Kniffel.Game;
import Kniffel.GameMode;
import Kniffel.scorecard.Scorecard;
import Kniffel.service.Printer;
import org.junit.jupiter.api.Test;
// TODO

class YahtzeeScorecardBuilderTest
{
    @Test
    void build()
    {
        YahtzeeScorecard yahtzeeScorecard = new YahtzeeScorecardBuilder().build();
        System.out.println(yahtzeeScorecard);
    }

    @Test
    void duplicate() throws Exception
    {
        Game.setGameMode(GameMode.YAHTZEE);
        Game.setAmountOfRounds(1);

        YahtzeeScorecard yahtzeeScorecard = new YahtzeeScorecardBuilder().setPlayerName("Ramy").build();
        Scorecard yahtzeeScorecardCopy = yahtzeeScorecard.duplicateWithDifferentNameAndEmptyPoints("Karim");

        yahtzeeScorecardCopy.getPointsColumns().get(0).getPointsBoxes().get(0).setPoints(40);

        System.out.println(yahtzeeScorecard);
        System.out.println(yahtzeeScorecardCopy);
    }

    @Test
    void print() throws Exception
    {
        Game.setGameMode(GameMode.YAHTZEE);
        Game.setAmountOfRounds(1);

        YahtzeeScorecard yahtzeeScorecard = new YahtzeeScorecardBuilder().setPlayerName("Ramy").build();

        Printer.printScoreCard(yahtzeeScorecard);
    }
}