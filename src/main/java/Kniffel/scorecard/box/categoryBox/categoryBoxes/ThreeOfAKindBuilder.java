package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class ThreeOfAKindBuilder extends CategoryBoxBuilder<ThreeOfAKindBuilder>
{
    private String category = "Three Of A Kind";
    private String description = "At least three dice the same";
    private String scoreComposition = "Sum of all dice";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

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

    public ThreeOfAKindBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public ThreeOfAKind build()
    {
        return new ThreeOfAKind(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected ThreeOfAKindBuilder self()
    {
        return this;
    }
}