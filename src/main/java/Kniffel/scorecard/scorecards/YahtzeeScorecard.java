package Kniffel.scorecard.scorecards;

import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.section.Section;

import java.util.List;

public class YahtzeeScorecard extends KniffelScorecard
{
    public YahtzeeScorecard(String playerName, List<Section> sections, List<PointsColumn> pointsColumns)
    {
        super(playerName, sections, pointsColumns);
    }
}
