package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class FourOfAKindBuilder extends CategoryBoxBuilder<FourOfAKindBuilder>
{
    private String category = "Four Of A Kind";
    private String description = "At least four dice the same";
    private String scoreComposition = "Sum of all dice";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

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

    public FourOfAKindBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public FourOfAKind build()
    {
        return new FourOfAKind(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected FourOfAKindBuilder self()
    {
        return this;
    }
}