package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.service.DiceRoller;
import Kniffel.service.IntegerListHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreeOfAKind extends CategoryBox
{
    ThreeOfAKind(String category, String description, String scoreComposition)
    {
        super(category, description, scoreComposition);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return DiceRoller.d6.stream()
                .anyMatch(n -> IntegerListHandler.checkHasNumberTheAmountOfTimes((List<Integer>) currentThrow, n, 3));
    }

    @Override
    public int calculate(List<Integer> currentThrow)
    {
        return currentThrow.stream()
                .reduce(0, Integer::sum);
    }
}
