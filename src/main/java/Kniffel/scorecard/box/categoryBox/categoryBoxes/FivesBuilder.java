package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class FivesBuilder extends CategoryBoxBuilder<FivesBuilder>
{
    private String category = "Fives";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 5";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.UPPER_SECTION_WITHOUT_BONUS,
                                                        SectionEnum.UPPER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public FivesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public FivesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public FivesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public FivesBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Fives build()
    {
        return new Fives(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected FivesBuilder self()
    {
        return this;
    }
}