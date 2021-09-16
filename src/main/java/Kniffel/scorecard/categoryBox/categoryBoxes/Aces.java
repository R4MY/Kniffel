package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Aces extends CategoryBox
{
    Aces(String category, String description, String scoreComposition)
    {
        super(category, description, scoreComposition);
    }

    @Override
    public boolean checkRequirementsMet(Object currentThrow)
    {
        return true;
    }

    @Override
    public int calculateScore(List<Integer> currentThrow)
    {
        return currentThrow.stream()
                .filter(d -> d.equals(1))
                .reduce(0, Integer::sum);
    }
}
