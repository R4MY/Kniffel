package Kniffel.scorecard.section.upperSection;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.scorecard.UpperSectionBuilder;
import Kniffel.scorecard.section.bonus.Bonus;
import Kniffel.scorecard.section.Section;

import java.util.Set;

public class UpperSection extends Section
{
    private final Bonus bonus;

    public UpperSection(Set<CategoryBox> categoryBoxSet, Bonus bonus)
    {
        super(categoryBoxSet);
        this.bonus = bonus;
    }

    public static UpperSection getUpperSection()
    {
        return new UpperSectionBuilder().createUpperSection();
    }
}
