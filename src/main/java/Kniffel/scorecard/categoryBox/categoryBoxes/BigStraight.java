package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.service.IntegerListHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BigStraight extends CategoryBox
{
    BigStraight(String category, String description, String scoreComposition)
    {
        super(category, description, scoreComposition);
    }

    @Override
    public boolean checkRequirementsMet(Object currentThrow)
    {
        return IntegerListHandler.checkHasSequenceOfMinimumTheLength((List<Integer>) currentThrow, 5);
    }

    @Override
    public int calculateScore(List<Integer> currentThrow)
    {
        return 40;
    }
}
