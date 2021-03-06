package Kniffel.scorecard.scorecards;

import Kniffel.scorecard.ScorecardBuilder;
import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.pointsColumn.PointsColumnListBuilder;
import Kniffel.scorecard.section.Section;
import Kniffel.scorecard.section.SectionListBuilder;
import Kniffel.scorecard.section.sections.LowerSectionBuilder;
import Kniffel.scorecard.section.sections.TotalsSectionBuilder;
import Kniffel.scorecard.section.sections.UpperSectionBuilder;

import java.util.List;

public class YahtzeeScorecardBuilder extends ScorecardBuilder<YahtzeeScorecardBuilder>
{
    private String playerName = "Guest";
    private List<Section> sections = new SectionListBuilder()
            .addList()
            .addSection(new UpperSectionBuilder().build())
            .addSection(new LowerSectionBuilder().addYahtzeeBonus().build())
            .addSection(new TotalsSectionBuilder().build())
            .buildList();
    private List<PointsColumn> pointsColumns = new PointsColumnListBuilder().buildList(sections);

    public YahtzeeScorecardBuilder setPlayerName(String playerName)
    {
        this.playerName = playerName;
        return this;
    }

    public YahtzeeScorecardBuilder setSections(List<Section> sections)
    {
        this.sections = sections;
        return this;
    }

    public YahtzeeScorecardBuilder setPointsColumns(List<PointsColumn> pointsColumns)
    {
        this.pointsColumns = pointsColumns;
        return this;
    }

    @Override
    public YahtzeeScorecard build()
    {
        return new YahtzeeScorecard(playerName, sections, pointsColumns);
    }

    @Override
    protected YahtzeeScorecardBuilder self()
    {
        return this;
    }
}