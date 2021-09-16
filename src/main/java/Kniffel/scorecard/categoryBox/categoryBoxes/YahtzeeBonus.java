package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;

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
    public int calculate(List<Integer> currentThrow)
    {
        return 100;
    }
}
