package Kniffel.scorecard.pointsColumn;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PointsColumn
{
    private int gameNumber;
    private Map<String, Integer> pointsBoxes = new HashMap<>();

    PointsColumn(int gameNumber, Map<String, Integer> pointsBoxes)
    {
        this.gameNumber = gameNumber;
        this.pointsBoxes = pointsBoxes;
    }

    public int getGameNumber()
    {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber)
    {
        this.gameNumber = gameNumber;
    }

    public Map<String, Integer> getPointsBoxes()
    {
        return pointsBoxes;
    }

    public void setPointsBoxes(Map<String, Integer> pointsBoxes)
    {
        this.pointsBoxes = pointsBoxes;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointsColumn that = (PointsColumn) o;
        return Objects.equals(gameNumber, that.gameNumber) && Objects.equals(pointsBoxes, that.pointsBoxes);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(gameNumber, pointsBoxes);
    }

    @Override
    public String toString()
    {
        return "\nPointsColumn\n{\n"
                + "   \"gameNumber\" : \"" + gameNumber + "\""
                + ",\n   \"pointsBoxes\" : " + pointsBoxes
                + "\n}";
    }

}
