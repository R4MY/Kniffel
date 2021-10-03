package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.section.sections.SectionEnum;
import Kniffel.service.IntegerListHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BigStraight extends CategoryBox
{
    public BigStraight()
    {
    }

    public BigStraight(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return IntegerListHandler.checkHasSequenceOfMinimumTheLength((List<Integer>) currentThrow, 5);
    }

    @Override
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;

        return check(currentThrow) ? 40 : 0;
    }

    @Override
    public int getValue()
    {
        return 140;
    }
}
