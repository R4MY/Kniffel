package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Threes extends CategoryBox
{
    public Threes(@Value("${yahtzee.categoryBoxes.threes.category}") String category,
                  @Value("${yahtzee.categoryBoxes.threes.description}") String description,
                  @Value("${yahtzee.categoryBoxes.threes.score}") String score)
    {
        super(category, description, score);
    }

    @Override
    public boolean checkRequirementsMet(List<Integer> currentThrow)
    {
        return true;
    }

    @Override
    public int calculateScore(List<Integer> currentThrow)
    {
        return currentThrow.    stream()
                .filter(d -> d.equals(3))
                .reduce(0, Integer::sum);
    }
}
