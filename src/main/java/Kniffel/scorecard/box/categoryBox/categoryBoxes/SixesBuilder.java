package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class SixesBuilder extends CategoryBoxBuilder<SixesBuilder>
{
    private String category = "Sixes";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 6";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.UPPER_SECTION_WITHOUT_BONUS,
                                                        SectionEnum.UPPER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public SixesBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public SixesBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public SixesBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public SixesBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Sixes build()
    {
        return new Sixes(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected SixesBuilder self()
    {
        return this;
    }
}