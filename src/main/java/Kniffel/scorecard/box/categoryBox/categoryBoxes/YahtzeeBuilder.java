package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;

public class YahtzeeBuilder extends CategoryBoxBuilder<YahtzeeBuilder>
{
    private String category = "Yahtzee";
    private String description = "All five dice the same";
    private String scoreComposition = "50";

    public YahtzeeBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public YahtzeeBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public YahtzeeBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    public Yahtzee build()
    {
        return new Yahtzee(category, description, scoreComposition);
    }

    @Override
    protected YahtzeeBuilder self()
    {
        return this;
    }
}