package Kniffel.scorecard.box.totalsBox.totalsBoxes;

import Kniffel.scorecard.box.totalsBox.TotalsBoxBuilder;

public class TotalOfUpperSectionWithoutBonusBuilder extends TotalsBoxBuilder<TotalOfUpperSectionWithoutBonusBuilder>
{
    private String category = "Total of Upper Section without Bonus";
    private String calculatedScore = null;

    public TotalOfUpperSectionWithoutBonusBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public TotalOfUpperSectionWithoutBonusBuilder setCalculatedScore(String calculatedScore)
    {
        this.calculatedScore = calculatedScore;
        return this;
    }

    @Override
    public TotalOfUpperSectionWithoutBonus build()
    {
        return new TotalOfUpperSectionWithoutBonus(category, calculatedScore);
    }

    @Override
    protected TotalOfUpperSectionWithoutBonusBuilder self()
    {
        return this;
    }
}