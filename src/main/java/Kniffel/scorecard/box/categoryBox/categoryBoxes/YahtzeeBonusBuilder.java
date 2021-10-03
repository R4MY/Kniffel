package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class YahtzeeBonusBuilder extends CategoryBoxBuilder<YahtzeeBonusBuilder>
{
    private String category = "Yahtzee Bonus";
    private String description = "Each Yahtzee after the first";
    private String scoreComposition = "100";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public YahtzeeBonusBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public YahtzeeBonusBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public YahtzeeBonusBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public YahtzeeBonusBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public YahtzeeBonus build()
    {
        return new YahtzeeBonus(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected YahtzeeBonusBuilder self()
    {
        return this;
    }
}