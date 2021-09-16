package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class ThreeOfAKindBuilder extends CategoryBoxBuilder<ThreeOfAKindBuilder>
{
    private String category = "Three Of A Kind";
    private String description = "At least three dice the same";
    private String scoreComposition = "Sum of all dice";

    public ThreeOfAKindBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public ThreeOfAKindBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public ThreeOfAKindBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected ThreeOfAKind build()
    {
        return new ThreeOfAKind(category, description, scoreComposition);
    }

    @Override
    protected ThreeOfAKindBuilder self()
    {
        return this;
    }
}