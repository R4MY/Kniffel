package Kniffel.scorecard.scorecards;

import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.section.Section;

import java.util.List;

public class KniffelScorecard extends Scorecard
{
    public KniffelScorecard(String playerName, List<Section> sections, List<PointsColumn> pointsColumns)
    {
        super(playerName, sections, pointsColumns);
    }
}
