package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.service.DiceRoller;
import Kniffel.service.IntegerListHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FullHouse extends CategoryBox
{
    FullHouse(String category, String description, String scoreComposition)
    {
        super(category, description, scoreComposition);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return DiceRoller.d6.stream()
                .filter(n -> IntegerListHandler.checkHasNumberTheAmountOfTimes((List<Integer>) currentThrow, n, 3))
                .findAny().filter(integer -> DiceRoller.d6.stream()
                        .filter(n -> !n.equals(integer))
                        .anyMatch(n -> IntegerListHandler.checkHasNumberTheAmountOfTimes((List<Integer>) currentThrow, n, 2))).isPresent();
    }

    @Override
    public int calculate(List<Integer> currentThrow)
    {
        if (check(currentThrow))
            return 25;
        return 0;
    }
}
