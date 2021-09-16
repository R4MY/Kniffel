package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class TwosBuilder extends CategoryBoxBuilder<TwosBuilder>
{
    private String category = "Twos";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 2";

    public TwosBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public TwosBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public TwosBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected Twos build()
    {
        return new Twos(category, description, scoreComposition);
    }

    @Override
    protected TwosBuilder self()
    {
        return this;
    }
}