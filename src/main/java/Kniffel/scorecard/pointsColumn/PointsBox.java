package Kniffel.scorecard.pointsColumn;

import Kniffel.scorecard.box.Box;

import java.util.Objects;

public class PointsBox
{
    private Box box;
    private Integer points;

    public PointsBox(Box box, Integer points)
    {
        this.box = box;
        this.points = points;
    }

    public Box getBox()
    {
        return box;
    }

    public void setBox(Box box)
    {
        this.box = box;
    }

    public Integer getPoints()
    {
        return points;
    }

    public void setPoints(Integer points)
    {
        this.points = points;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointsBox pointsBox = (PointsBox) o;
        return points == pointsBox.points && Objects.equals(box, pointsBox.box);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(box, points);
    }

    @Override
    public String toString()
    {
        return "\nPointsBox\n{\n"
                + "   \"category\" : " + box.getCategory()
                + ",\n   \"points\" : \"" + points + "\""
                + "\n}";
    }

    public PointsBox duplicateWithNullPoints()
    {
        return new PointsBox(box, null);
    }
}
