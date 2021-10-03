package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class BigStraightBuilder extends CategoryBoxBuilder<BigStraightBuilder>
{
    private String category = "Big Straight";
    private String description = "Five sequential dice (1-2-3-4-5 or 2-3-4-5-6)";
    private String scoreComposition = "40";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

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

    public BigStraightBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public BigStraight build()
    {
        return new BigStraight(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected BigStraightBuilder self()
    {
        return this;
    }
}