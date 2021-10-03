package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class ThreesBuilder extends CategoryBoxBuilder<ThreesBuilder>
{
    private String category = "Threes";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 3";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.UPPER_SECTION_WITHOUT_BONUS,
                                                        SectionEnum.UPPER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public ThreesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public ThreesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public ThreesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public ThreesBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Threes build()
    {
        return new Threes(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected ThreesBuilder self()
    {
        return this;
    }
}