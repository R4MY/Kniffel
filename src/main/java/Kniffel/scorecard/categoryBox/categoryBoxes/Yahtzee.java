package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.service.DiceRoller;
import Kniffel.service.IntegerListHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Yahtzee extends CategoryBox
{
    public Yahtzee(@Value("${yahtzee.categoryBoxes.yahtzee.category}") String category,
                   @Value("${yahtzee.categoryBoxes.yahtzee.description}") String description,
                   @Value("${yahtzee.categoryBoxes.yahtzee.score}") String score)
    {
        super(category, description, score);
    }

    @Override
    public boolean checkRequirementsMet(List<Integer> currentThrow)
    {
        return DiceRoller.d6.stream()
                .anyMatch(n -> IntegerListHandler.checkHasNumberTheAmountOfTimes(currentThrow, n, 5));
    }

    @Override
    public int calculateScore(List<Integer> currentThrow)
    {
        return 50;
    }
}
