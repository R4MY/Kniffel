package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class AcesBuilder extends CategoryBoxBuilder<AcesBuilder>
{
    private String category = "Aces";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 1";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.UPPER_SECTION_WITHOUT_BONUS,
                                                        SectionEnum.UPPER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public AcesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public AcesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public AcesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public AcesBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Aces build()
    {
        return new Aces(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected AcesBuilder self()
    {
        return this;
    }
}