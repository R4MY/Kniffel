package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.section.sections.SectionEnum;
import Kniffel.service.DiceRoller;
import Kniffel.service.IntegerListHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FullHouse extends CategoryBox
{
    public FullHouse()
    {
    }

    public FullHouse(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return DiceRoller.d6.stream()
                            .filter(n -> IntegerListHandler.checkHasNumberMinimumTheAmountOfTimes((List<Integer>) currentThrow, n, 3))
                            .findAny().filter(integer -> DiceRoller.d6.stream()
                        .filter(n -> !n.equals(integer))
                        .anyMatch(n -> IntegerListHandler.checkHasNumberMinimumTheAmountOfTimes((List<Integer>) currentThrow, n, 2))).isPresent();
    }

    @Override
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;
        return check(currentThrow) ? 25 : 0;
    }

    @Override
    public int getValue()
    {
        return 120;
    }
}
