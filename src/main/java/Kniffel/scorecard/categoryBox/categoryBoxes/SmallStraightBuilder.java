package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class SmallStraightBuilder extends CategoryBoxBuilder<SmallStraightBuilder>
{
    private String category = "Small Straight";
    private String description = "Four sequential dice (1-2-3-4, 2-3-4-5, or 3-4-5-6)";
    private String scoreComposition = "30";

    public SmallStraightBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public SmallStraightBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public SmallStraightBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    protected SmallStraight build()
    {
        return new SmallStraight(category, description, scoreComposition);
    }

    @Override
    protected SmallStraightBuilder self()
    {
        return this;
    }
}