package Kniffel.scorecard;

import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.section.Section;

import java.util.List;
import java.util.Objects;

//TODO MAYBE USE PROTOTYPE PATTERN!
public abstract class Scorecard
{
    private String playerName;
    private List<Section> sections;
    private List<PointsColumn> pointsColumns;

    public Scorecard(String playerName, List<Section> sections, List<PointsColumn> pointsColumns)
    {
        this.playerName = playerName;
        this.sections = sections;
        this.pointsColumns = pointsColumns;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public List<Section> getSections()
    {
        return sections;
    }

    public void setSections(List<Section> sections)
    {
        this.sections = sections;
    }

    public List<PointsColumn> getPointsColumns()
    {
        return pointsColumns;
    }

    public void setPointsColumns(List<PointsColumn> pointsColumns)
    {
        this.pointsColumns = pointsColumns;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scorecard scorecard = (Scorecard) o;
        return Objects.equals(playerName, scorecard.playerName) && Objects.equals(sections, scorecard.sections) && Objects.equals(pointsColumns, scorecard.pointsColumns);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(playerName, sections, pointsColumns);
    }

    @Override
    public String toString()
    {
        return "\nScorecard\n{\n"
                + "   \"playerName\" : \"" + playerName + "\""
                + ",\n   \"sections\" : " + sections
                + ",\n   \"pointsColumns\" : " + pointsColumns
                + "\n}";
    }

}
