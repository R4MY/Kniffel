package Kniffel.scorecard.box;

import Kniffel.scorecard.box.categoryBox.ScoreCalculator;

import java.util.Objects;

public abstract class Box implements BoxValue, ScoreCalculator
{
    private String category;

    public Box()
    {
    }

    public Box(String category)
    {
        this.category = category;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(category, box.category);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(category);
    }

    @Override
    public String toString()
    {
        return ""
                + "   \"category\" : \"" + category + "\""
                + "";
    }

}
