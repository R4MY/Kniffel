package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class UpperBonusBuilder extends CategoryBoxBuilder<UpperBonusBuilder>
{
    private String category = "Bonus";
    private String description = "if upper score is 63 or over";
    private String scoreComposition = "35";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.UPPER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public UpperBonusBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public UpperBonusBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public UpperBonusBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public UpperBonusBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public UpperBonus build()
    {
        return new UpperBonus(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected UpperBonusBuilder self()
    {
        return this;
    }
}