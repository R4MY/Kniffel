package Kniffel;

import Kniffel.scorecard.Scorecard;

import java.util.Set;

public class Game
{
    private static Set<Scorecard> scorecards;
    private static Scorecard currentPlayer;

    public static Set<Scorecard> getScorecards()
    {
        return scorecards;
    }

    public static void setScorecards(Set<Scorecard> scorecards)
    {
        Game.scorecards = scorecards;
    }

    public static Scorecard getCurrentPlayer()
    {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Scorecard currentPlayer)
    {
        Game.currentPlayer = currentPlayer;
    }
}
