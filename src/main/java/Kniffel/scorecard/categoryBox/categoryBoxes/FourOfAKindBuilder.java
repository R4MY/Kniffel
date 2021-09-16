package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class FourOfAKindBuilder extends CategoryBoxBuilder<FourOfAKindBuilder>
{
    private String category = "Four Of A Kind";
    private String description = "At least four dice the same";
    private String scoreComposition = "Sum of all dice";

    public FourOfAKindBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public FourOfAKindBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public FourOfAKindBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected FourOfAKind build()
    {
        return new FourOfAKind(category, description, scoreComposition);
    }

    @Override
    protected FourOfAKindBuilder self()
    {
        return this;
    }
}