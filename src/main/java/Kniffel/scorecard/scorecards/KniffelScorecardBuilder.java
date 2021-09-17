package Kniffel.scorecard.scorecards;

import Kniffel.scorecard.ScorecardBuilder;
import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.pointsColumn.PointsColumnListBuilder;
import Kniffel.scorecard.section.Section;
import Kniffel.scorecard.section.SectionListBuilder;

import java.util.List;
public class KniffelScorecardBuilder extends ScorecardBuilder<KniffelScorecardBuilder>
{
    private String playerName = "Gast";
    private List<Section> sections = new SectionListBuilder().buildList();
    private List<PointsColumn> pointsColumns = new PointsColumnListBuilder().buildList(sections);

    public KniffelScorecardBuilder setPlayerName(String playerName)
    {
        this.playerName = playerName;
        return this;
    }

    public KniffelScorecardBuilder setSections(List<Section> sections)
    {
        this.sections = sections;
        return this;
    }

    public KniffelScorecardBuilder setPointsColumns(List<PointsColumn> pointsColumns)
    {
        this.pointsColumns = pointsColumns;
        return this;
    }

    @Override
    public KniffelScorecard build()
    {
        return new KniffelScorecard(playerName, sections, pointsColumns);
    }

    @Override
    protected KniffelScorecardBuilder self()
    {
        return this;
    }
}