package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Fours extends CategoryBox
{
    Fours(String category, String description, String scoreComposition)
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
        return currentThrow.    stream()
                .filter(d -> d.equals(4))
                .reduce(0, Integer::sum);
    }
}
