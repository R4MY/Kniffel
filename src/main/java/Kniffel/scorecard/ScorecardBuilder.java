package Kniffel.scorecard;

import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.section.Section;

import java.util.List;

public abstract class ScorecardBuilder<T extends ScorecardBuilder>
{
    private String playerName;
    private List<Section> sections;
    private List<PointsColumn> pointsColumns;

    private ScorecardListBuilder scorecardListBuilder;

    public ScorecardBuilder()
    {
    }

    public ScorecardBuilder(ScorecardListBuilder scorecardListBuilder)
    {
        this.scorecardListBuilder = scorecardListBuilder;
    }

    public ScorecardBuilder setPlayerName(String playerName)
    {
        this.playerName = playerName;
        return this;
    }

    public ScorecardBuilder setSections(List<Section> sections)
    {
        this.sections = sections;
        return this;
    }

    public ScorecardBuilder setPointsColumns(List<PointsColumn> pointsColumns)
    {
        this.pointsColumns = pointsColumns;
        return this;
    }

    public abstract Scorecard build();

    ScorecardListBuilder addScorecardToList()
    {
        Scorecard scorecard = build();
        this.scorecardListBuilder.addScorecard(scorecard);
        return this.scorecardListBuilder;
    }

    protected abstract T self();
}