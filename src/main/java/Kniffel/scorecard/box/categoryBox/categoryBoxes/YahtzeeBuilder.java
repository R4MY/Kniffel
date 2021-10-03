package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class YahtzeeBuilder extends CategoryBoxBuilder<YahtzeeBuilder>
{
    private String category = "Yahtzee";
    private String description = "All five dice the same";
    private String scoreComposition = "50";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public YahtzeeBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public YahtzeeBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public YahtzeeBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public YahtzeeBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Yahtzee build()
    {
        return new Yahtzee(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected YahtzeeBuilder self()
    {
        return this;
    }
}