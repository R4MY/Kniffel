package Kniffel.scorecard.pointsColumn;

import Kniffel.scorecard.categoryBox.CategoryBox;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PointsColumn
{
    private String gameNumber;

    private Map<CategoryBox, Integer> pointsBoxes = new HashMap<>();

    PointsColumn(String gameNumber, Map<CategoryBox, Integer> pointsBoxes)
    {
        this.gameNumber = gameNumber;
        this.pointsBoxes = pointsBoxes;
    }

    public String getGameNumber()
    {
        return gameNumber;
    }

    public void setGameNumber(String gameNumber)
    {
        this.gameNumber = gameNumber;
    }

    public Map<CategoryBox, Integer> getPointsBoxes()
    {
        return pointsBoxes;
    }

    public void setPointsBoxes(Map<CategoryBox, Integer> pointsBoxes)
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
        return "PointsColumn{" +
                "gameNumber='" + gameNumber + '\'' +
                ", pointsBoxes=" + pointsBoxes +
                '}';
    }
}
