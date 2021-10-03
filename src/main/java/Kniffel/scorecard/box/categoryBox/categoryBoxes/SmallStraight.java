package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.section.sections.SectionEnum;
import Kniffel.service.IntegerListHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmallStraight extends CategoryBox
{
    public SmallStraight()
    {
    }

    public SmallStraight(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return IntegerListHandler.checkHasSequenceOfMinimumTheLength((List<Integer>) currentThrow, 4);
    }

    @Override
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;
        return check(currentThrow) ? 30 : 0;
    }

    @Override
    public int getValue()
    {
        return 130;
    }
}
