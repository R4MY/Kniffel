package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class YahtzeeBonusBuilder extends CategoryBoxBuilder<YahtzeeBonusBuilder>
{
    private String category = "Yahtzee Bonus";
    private String description = "Each Yahtzee after the first";
    private String scoreComposition = "100";

    public YahtzeeBonusBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public YahtzeeBonusBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public YahtzeeBonusBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected YahtzeeBonus build()
    {
        return new YahtzeeBonus(category, description, scoreComposition);
    }

    @Override
    protected YahtzeeBonusBuilder self()
    {
        return this;
    }
}