package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class ChanceBuilder extends CategoryBoxBuilder<ChanceBuilder>
{
    private String category = "Chance";
    private String description = "Any combination";
    private String scoreComposition = "Sum of all dice";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

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

    public ChanceBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Chance build()
    {
        return new Chance(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected ChanceBuilder self()
    {
        return this;
    }
}