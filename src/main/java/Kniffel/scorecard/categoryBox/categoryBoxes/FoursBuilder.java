package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class FoursBuilder extends CategoryBoxBuilder<FoursBuilder>
{
    private String category = "Fours";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 4";

    public FoursBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public FoursBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public FoursBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected Fours build()
    {
        return new Fours(category, description, scoreComposition);
    }

    @Override
    protected FoursBuilder self()
    {
        return this;
    }
}