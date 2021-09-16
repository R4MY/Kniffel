package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.scorecard.categoryBox.CategoryBoxBuilder;

public class ChanceBuilder extends CategoryBoxBuilder<ChanceBuilder>
{
    private String category = "Chance";
    private String description = "Any combination";
    private String scoreComposition = "Sum of all dice";

    public ChanceBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public ChanceBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public ChanceBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    @Override
    public Chance build()
    {
        return new Chance(category, description, scoreComposition);
    }

    @Override
    protected ChanceBuilder self()
    {
        return this;
    }
}