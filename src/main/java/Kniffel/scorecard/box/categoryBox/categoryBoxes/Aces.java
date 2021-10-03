package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.section.sections.SectionEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Aces extends CategoryBox
{

    public Aces()
    {
    }

    public Aces(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category, description, scoreComposition, sectionsToAddTo);
    }

    @Override
    public boolean check(Object currentThrow)
    {
        return true;
    }

    @Override
    public int calculate(Object currentThrow)
    {
        List<Integer> integerList = (List<Integer>) currentThrow;

        return check(currentThrow) ? integerList.stream()
                .filter(d -> d.equals(1))
                .reduce(0, Integer::sum) : 0;
    }

    @Override
    public int getValue()
    {
        return 10;
    }
}
