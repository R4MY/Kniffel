package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.section.sections.SectionEnum;
import Kniffel.service.DiceRoller;
import Kniffel.service.IntegerListHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Yahtzee extends CategoryBox
{
    public Yahtzee()
    {
    }

    public Yahtzee(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return DiceRoller.d6.stream()
                .anyMatch(n -> IntegerListHandler.checkHasNumberMinimumTheAmountOfTimes((List<Integer>) currentThrow, n, 5));
    }

    @Override
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;
        return check(currentThrow) ? 50 : 0;
    }

    @Override
    public int getValue()
    {
        return 150;
    }
}
