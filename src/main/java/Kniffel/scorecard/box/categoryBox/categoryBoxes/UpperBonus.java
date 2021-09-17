package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpperBonus extends CategoryBox
{
    public UpperBonus()
    {
    }

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
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;
        return 35;
    }
}
