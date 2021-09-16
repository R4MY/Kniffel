package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.service.IntegerListHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmallStraight extends CategoryBox
{
    SmallStraight(String category, String description, String scoreComposition)
    {
        super(category, description, scoreComposition);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return IntegerListHandler.checkHasSequenceOfMinimumTheLength((List<Integer>) currentThrow, 4);
    }

    @Override
    public int calculate(List<Integer> currentThrow)
    {
        return 30;
    }
}
