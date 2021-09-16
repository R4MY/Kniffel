package Kniffel;

import Kniffel.scorecard.Scorecard;

import java.util.Set;
//TODO WHOLE CLASS
public class Game
{
    private static Set<Scorecard> scorecards;

    public static Set<Scorecard> getScorecards()
    {
        return scorecards;
    }

    public static void setScorecards(Set<Scorecard> scorecards)
    {
        Game.scorecards = scorecards;
    }
}
