package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class SmallStraightBuilder extends CategoryBoxBuilder<SmallStraightBuilder>
{
    private String category = "Small Straight";
    private String description = "Four sequential dice (1-2-3-4, 2-3-4-5, or 3-4-5-6)";
    private String scoreComposition = "30";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

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

    public SmallStraightBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public SmallStraight build()
    {
        return new SmallStraight(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected SmallStraightBuilder self()
    {
        return this;
    }
}