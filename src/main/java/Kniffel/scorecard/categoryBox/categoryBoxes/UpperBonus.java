package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpperBonus extends CategoryBox
{
    UpperBonus(String category, String description, String scoreComposition)
    {
        super(category, description, scoreComposition);
    }


// TODO IMPLEMENTATION  (can only be done after scorecard is done)
    @Override
    public boolean check(Object scoreCard)
    {
        return true;
    }

    @Override
    public int calculate(List<Integer> currentThrow)
    {
        return 35;
    }
}
