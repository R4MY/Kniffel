package Kniffel.scorecard.box.totalsBox;

import Kniffel.scorecard.box.Box;

import java.util.Objects;

public abstract class TotalsBox extends Box
{
    private String calculatedScore;

    public TotalsBox()
    {
    }

    public TotalsBox(String category, String calculatedScore)
    {
        super(category);
        this.calculatedScore = calculatedScore;
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
        if (!super.equals(o)) return false;
        TotalsBox totalsBox = (TotalsBox) o;
        return Objects.equals(calculatedScore, totalsBox.calculatedScore);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), calculatedScore);
    }

    @Override
    public String toString()
    {
        return "TotalsBox{" +
                "category='" + super.getCategory() + '\'' +
                ",calculatedScore='" + calculatedScore + '\'' +
                '}';
    }
}