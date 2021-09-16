package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.service.IntegerListHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmallStraight extends CategoryBox
{
    public SmallStraight(@Value("${yahtzee.categoryBoxes.smallStraight.category}") String category,
                         @Value("${yahtzee.categoryBoxes.smallStraight.description}") String description,
                         @Value("${yahtzee.categoryBoxes.smallStraight.score}") String score)
    {
        super(category, description, score);
    }

    @Override
    public boolean checkRequirementsMet(List<Integer> currentThrow)
    {
        return IntegerListHandler.checkHasSequenceOfMinimumTheLength(currentThrow, 4);
    }

    @Override
    public int calculateScore(List<Integer> currentThrow)
    {
        return 30;
    }
}
