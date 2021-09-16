package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sixes extends CategoryBox
{
    public Sixes(@Value("${yahtzee.categoryBoxes.sixes.category}") String category,
                 @Value("${yahtzee.categoryBoxes.sixes.description}") String description,
                 @Value("${yahtzee.categoryBoxes.sixes.score}") String score)
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
                .filter(d -> d.equals(6))
                .reduce(0, Integer::sum);
    }
}
