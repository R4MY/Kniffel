package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;

public class FivesBuilder extends CategoryBoxBuilder<FivesBuilder>
{
    private String category = "Fives";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 5";

    public FivesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public FivesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public FivesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    public Fives build()
    {
        return new Fives(category, description, scoreComposition);
    }

    @Override
    protected FivesBuilder self()
    {
        return this;
    }
}