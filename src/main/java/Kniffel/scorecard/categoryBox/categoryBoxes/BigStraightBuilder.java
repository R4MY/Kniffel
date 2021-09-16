package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class BigStraightBuilder extends CategoryBoxBuilder<BigStraightBuilder>
{
    private String category = "Big Straight";
    private String description = "Five sequential dice (1-2-3-4-5 or 2-3-4-5-6)";
    private String scoreComposition = "40";

    public BigStraightBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public BigStraightBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public BigStraightBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected BigStraight build()
    {
        return new BigStraight(category, description, scoreComposition);
    }

    @Override
    protected BigStraightBuilder self()
    {
        return this;
    }
}