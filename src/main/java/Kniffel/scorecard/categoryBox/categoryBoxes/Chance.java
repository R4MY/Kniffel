package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Chance extends CategoryBox
{
    Chance(String category, String description, String scoreComposition)
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
                .reduce(0, Integer::sum);
    }
}
