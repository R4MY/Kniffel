package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class FullHouseBuilder extends CategoryBoxBuilder<FullHouseBuilder>
{
    private String category = "Full House";
    private String description = "Three of one number and two of another";
    private String scoreComposition = "25";

    public FullHouseBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public FullHouseBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public FullHouseBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected FullHouse build()
    {
        return new FullHouse(category, description, scoreComposition);
    }

    @Override
    protected FullHouseBuilder self()
    {
        return this;
    }
}