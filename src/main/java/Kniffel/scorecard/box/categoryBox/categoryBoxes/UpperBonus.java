package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.section.sections.SectionEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpperBonus extends CategoryBox
{
    public UpperBonus()
    {
    }

    public UpperBonus(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    public boolean check(Object scoreCard)
    {
        return true;
    }

    @Override
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;
        return check(currentThrow) ? 35 : 0;
    }

    @Override
    public int getValue()
    {
        return 80;
    }
}
