package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class FullHouseBuilder extends CategoryBoxBuilder<FullHouseBuilder>
{
    private String category = "Full House";
    private String description = "Three of one number and two of another";
    private String scoreComposition = "25";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.LOWER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public FullHouseBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public FullHouseBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public FullHouseBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public FullHouseBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public FullHouse build()
    {
        return new FullHouse(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected FullHouseBuilder self()
    {
        return this;
    }
}