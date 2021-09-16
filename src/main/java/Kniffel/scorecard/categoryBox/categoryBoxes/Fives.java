package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Fives extends CategoryBox
{
    Fives(String category, String description, String scoreComposition)
    {
        super(category, description, scoreComposition);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return true;
    }

    @Override
    public int calculate(List<Integer> currentThrow)
    {
        return currentThrow.stream()
                .filter(d -> d.equals(5))
                .reduce(0, Integer::sum);
    }
}
