package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;

public class SixesBuilder extends CategoryBoxBuilder<SixesBuilder>
{
    private String category = "Sixes";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 6";

    public SixesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public SixesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public SixesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    public Sixes build()
    {
        return new Sixes(category, description, scoreComposition);
    }

    @Override
    protected SixesBuilder self()
    {
        return this;
    }
}