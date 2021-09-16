package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class ThreesBuilder extends CategoryBoxBuilder<ThreesBuilder>
{
    private String category = "Threes";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 3";

    public ThreesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public ThreesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public ThreesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected Threes build()
    {
        return new Threes(category, description, scoreComposition);
    }

    @Override
    protected ThreesBuilder self()
    {
        return this;
    }
}