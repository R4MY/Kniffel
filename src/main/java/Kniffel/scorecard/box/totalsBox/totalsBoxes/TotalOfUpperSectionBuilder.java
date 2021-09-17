package Kniffel.scorecard.box.totalsBox.totalsBoxes;

import Kniffel.scorecard.box.totalsBox.TotalsBoxBuilder;

public class TotalOfUpperSectionBuilder extends TotalsBoxBuilder<TotalOfUpperSectionBuilder>
{
    private String category = "Total of Upper Section";
    private String calculatedScore = null;

    public TotalOfUpperSectionBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public TotalOfUpperSectionBuilder setCalculatedScore(String calculatedScore)
    {
        this.calculatedScore = calculatedScore;
        return this;
    }

    @Override
    public TotalOfUpperSection build()
    {
        return new TotalOfUpperSection(category, calculatedScore);
    }

    @Override
    protected TotalOfUpperSectionBuilder self()
    {
        return this;
    }
}