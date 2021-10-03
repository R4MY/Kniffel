package Kniffel.scorecard.pointsColumn;

import java.util.*;

public class PointsColumn
{
    private int gameNumber;
    private List<PointsBox> pointsBoxes = new ArrayList<>();

    PointsColumn(int gameNumber, List<PointsBox> pointsBoxes)
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

    public List<PointsBox> getPointsBoxes()
    {
        return pointsBoxes;
    }

    public void setPointsBoxes(List<PointsBox> pointsBoxes)
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

    public PointsColumn duplicateWithEmptyPointsBoxes()
    {
        List<PointsBox> pointsBoxesCopy = new ArrayList<>();

        for (PointsBox pointsBox : pointsBoxes)
            pointsBoxesCopy.add(pointsBox.duplicateWithNullPoints());

        return new PointsColumn(gameNumber, pointsBoxesCopy);
    }

}
