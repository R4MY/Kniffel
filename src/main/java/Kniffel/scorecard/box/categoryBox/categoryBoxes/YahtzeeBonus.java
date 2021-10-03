package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;

public class YahtzeeBonus extends CategoryBox
{
    public YahtzeeBonus()
    {
    }

    public YahtzeeBonus(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category, description, scoreComposition, sectionsToAddTo);
    }

    // TODO
    @Override
    public boolean check(Object scoreCard)
    {
        return true;
    }

    @Override
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;
        return check(currentThrow) ? 100 : 0;
    }

    @Override
    public int getValue()
    {
        return 170;
    }
}
