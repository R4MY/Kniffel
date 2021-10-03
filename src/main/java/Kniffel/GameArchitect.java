package Kniffel;

import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.scorecards.KniffelScorecardBuilder;
import Kniffel.scorecard.scorecards.YahtzeeScorecardBuilder;
import Kniffel.scorecard.section.sections.TotalsSection;
import Kniffel.service.CheckpointPerformer;
import Kniffel.service.DialoguePerformer;

import java.util.ArrayList;
import java.util.List;

public class GameArchitect
{
    public static void createGame() throws Exception
    {
        CheckpointPerformer.perform();
        GameMode gameMode = DialoguePerformer.askGameMode();

        Game.setGameMode(gameMode);

        int amountOfPlayers = DialoguePerformer.askAmountOfPlayers();
        List<String> playerNames = DialoguePerformer.askPlayerNames(amountOfPlayers);
        int amountOfRounds = DialoguePerformer.askAmountOfRounds();

        Game.setAmountOfRounds(amountOfRounds);
        Game.setCurrentRound(0);

        List<Scorecard> scorecards = new ArrayList<>();

        Scorecard scorecard = createInitialScorecard(gameMode, playerNames.get(0));
        scorecards.add(scorecard);

        scorecards = playerNames.size() > 1 ? createRemainingScorecards(scorecard, playerNames, scorecards) : List.of(scorecard);

        Game.setAmountOfTurns(getAmountOfTurns(scorecard));
        Game.setScorecards(scorecards);
    }

    private static Scorecard createInitialScorecard(GameMode gameMode, String playerName) throws Exception
    {
        return switch (gameMode)
        {
            case KNIFFEL -> new KniffelScorecardBuilder().setPlayerName(playerName).build();
            case YAHTZEE -> new YahtzeeScorecardBuilder().setPlayerName(playerName).build();
            default -> throw new Exception();
        };
    }

    private static List<Scorecard> createRemainingScorecards(Scorecard scorecard, List<String> playerNames, List<Scorecard> scorecards) throws Exception
    {
        playerNames.remove(0);

        for (String playerName : playerNames)
        {
            scorecards.add(scorecard.duplicateWithDifferentNameAndEmptyPoints(playerName));
        }

        return scorecards;
    }

    private static int getAmountOfTurns(Scorecard scorecard)
    {
        return (int) scorecard.getSections().stream()
                              .filter(s -> !(s instanceof TotalsSection))
                              .count();
    }
}
