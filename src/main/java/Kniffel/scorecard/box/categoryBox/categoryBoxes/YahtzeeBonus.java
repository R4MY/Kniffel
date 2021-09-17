package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;

import java.util.List;

public class YahtzeeBonus extends CategoryBox
{
    YahtzeeBonus(String category, String description, String scoreComposition)
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
        return 100;
    }
}
