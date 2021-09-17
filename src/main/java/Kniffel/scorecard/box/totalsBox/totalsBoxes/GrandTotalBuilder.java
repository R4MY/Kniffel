package Kniffel.scorecard.box.totalsBox.totalsBoxes;

import Kniffel.scorecard.box.totalsBox.TotalsBoxBuilder;

public class GrandTotalBuilder extends TotalsBoxBuilder<GrandTotalBuilder>
{
    private String category = "Grand Total";
    private String calculatedScore = null;

    public GrandTotalBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public GrandTotalBuilder setCalculatedScore(String calculatedScore)
    {
        this.calculatedScore = calculatedScore;
        return this;
    }

    @Override
    public GrandTotal build()
    {
        return new GrandTotal(category, calculatedScore);
    }

    @Override
    protected GrandTotalBuilder self()
    {
        return this;
    }
}