package Kniffel.scorecard.box.totalsBox.totalsBoxes;

import Kniffel.scorecard.box.totalsBox.TotalsBoxBuilder;

public class TotalOfLowerSectionBuilder extends TotalsBoxBuilder<TotalOfLowerSectionBuilder>
{
    private String category = "Total of Lower Section";
    private String calculatedScore = null;

    public TotalOfLowerSectionBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public TotalOfLowerSectionBuilder setCalculatedScore(String calculatedScore)
    {
        this.calculatedScore = calculatedScore;
        return this;
    }

    @Override
    public TotalOfLowerSection build()
    {
        return new TotalOfLowerSection(category, calculatedScore);
    }

    @Override
    protected TotalOfLowerSectionBuilder self()
    {
        return this;
    }
}