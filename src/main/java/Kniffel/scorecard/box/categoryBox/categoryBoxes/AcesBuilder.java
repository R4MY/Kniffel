package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;

public class AcesBuilder extends CategoryBoxBuilder<AcesBuilder>
{
    private String category = "Aces";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 1";

    public AcesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public AcesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public AcesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    public Aces build()
    {
        return new Aces(category, description, scoreComposition);
    }

    @Override
    protected AcesBuilder self()
    {
        return this;
    }
}