package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.service.DiceRoller;
import Kniffel.service.IntegerListHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FourOfAKind extends CategoryBox
{
    public FourOfAKind(@Value("${yahtzee.categoryBoxes.fourOfAKind.category}") String category,
                       @Value("${yahtzee.categoryBoxes.fourOfAKind.description}") String description,
                       @Value("${yahtzee.categoryBoxes.fourOfAKind.score}") String score)
    {
        super(category, description, score);
    }

    @Override
    public boolean checkRequirementsMet(List<Integer> currentThrow)
    {
        return DiceRoller.d6.stream()
                .anyMatch(n -> IntegerListHandler.checkHasNumberTheAmountOfTimes(currentThrow, n, 4));
    }

    @Override
    public int calculateScore(List<Integer> currentThrow)
    {
        return currentThrow.stream()
                .reduce(0, Integer::sum);
    }
}
