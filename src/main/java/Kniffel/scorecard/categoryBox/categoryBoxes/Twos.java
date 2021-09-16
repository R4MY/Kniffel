package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Twos extends CategoryBox
{
    public Twos(@Value("${yahtzee.categoryBoxes.twos.category}") String category,
                @Value("${yahtzee.categoryBoxes.twos.description}") String description,
                @Value("${yahtzee.categoryBoxes.twos.score}") String score)
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
                .filter(d -> d.equals(2))
                .reduce(0, Integer::sum);
    }
}
