package Kniffel.scorecard.box.totalsBox;

import Kniffel.scorecard.box.Box;

import java.util.Objects;

public abstract class TotalsBox extends Box
{
    private String category;
    private String calculatedScore;

    public TotalsBox(String category, String calculatedScore)
    {
        this.category = category;
        this.calculatedScore = calculatedScore;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getCalculatedScore()
    {
        return calculatedScore;
    }

    public void setCalculatedScore(String calculatedScore)
    {
        this.calculatedScore = calculatedScore;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalsBox totalsBox = (TotalsBox) o;
        return Objects.equals(category, totalsBox.category) && Objects.equals(calculatedScore, totalsBox.calculatedScore);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(category, calculatedScore);
    }

    @Override
    public String toString()
    {
        return "TotalsBox{" +
                "category='" + category + '\'' +
                ", calculatedScore='" + calculatedScore + '\'' +
                '}';
    }
}