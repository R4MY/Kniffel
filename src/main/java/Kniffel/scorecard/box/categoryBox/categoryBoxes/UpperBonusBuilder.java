package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;

public class UpperBonusBuilder extends CategoryBoxBuilder<UpperBonusBuilder>
{
    private String category = "Bonus";
    private String description = "if upper score is 63 or over";
    private String scoreComposition = "35";

    public UpperBonusBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public UpperBonusBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public UpperBonusBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    public UpperBonus build()
    {
        return new UpperBonus(category, description, scoreComposition);
    }

    @Override
    protected UpperBonusBuilder self()
    {
        return this;
    }
}