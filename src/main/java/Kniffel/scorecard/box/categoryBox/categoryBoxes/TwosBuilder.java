package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBoxBuilder;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class TwosBuilder extends CategoryBoxBuilder<TwosBuilder>
{
    private String category = "Twos";
    private String description = "Any combination";
    private String scoreComposition = "The sum of dice with the number 2";
    private List<SectionEnum> sectionsToAddTo = List.of(SectionEnum.UPPER_SECTION_WITHOUT_BONUS,
                                                        SectionEnum.UPPER_SECTION,
                                                        SectionEnum.GRAND_TOTAL);

    public TwosBuilder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public TwosBuilder setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public TwosBuilder setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return this;
    }

    public TwosBuilder setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
        return this;
    }

    @Override
    public Twos build()
    {
        return new Twos(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    protected TwosBuilder self()
    {
        return this;
    }
}