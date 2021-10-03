package Kniffel;

import Kniffel.scorecard.Scorecard;

import java.util.ArrayList;
import java.util.List;

public class Game
{
    private static List<Scorecard> scorecards;
    private static GameMode gameMode;
    private static int amountOfTurns;
    private static int amountOfRounds;
    private static int currentRound;

    public static List<Scorecard> getScorecards()
    {
        return scorecards;
    }

    public static void setScorecards(List<Scorecard> scorecards)
    {
        Game.scorecards = new ArrayList<>(scorecards);
    }

    public static GameMode getGameMode()
    {
        return gameMode;
    }

    public static void setGameMode(GameMode gameMode)
    {
        Game.gameMode = gameMode;
    }

    public static int getAmountOfTurns()
    {
        return amountOfTurns;
    }

    public static void setAmountOfTurns(int amountOfTurns)
    {
        Game.amountOfTurns = amountOfTurns;
    }

    public static int getAmountOfRounds()
    {
        return amountOfRounds;
    }

    public static void setAmountOfRounds(int amountOfRounds)
    {
        Game.amountOfRounds = amountOfRounds;
    }

    public static int getCurrentRound()
    {
        return currentRound;
    }

    public static void setCurrentRound(int currentRound)
    {
        Game.currentRound = currentRound;
    }
}
