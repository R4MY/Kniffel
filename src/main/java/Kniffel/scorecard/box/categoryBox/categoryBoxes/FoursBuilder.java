package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class FoursBuilder extends CategoryBoxBuilder<FoursBuilder>
{
    private String category = "Fours";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 4";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.UPPER_SECTION_WITHOUT_BONUS,
                                                        SectionEnum.UPPER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public FoursBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public FoursBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public FoursBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public FoursBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Fours build()
    {
        return new Fours(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected FoursBuilder self()
    {
        return this;
    }
}