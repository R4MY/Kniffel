package Kniffel.scorecard.section;

import Kniffel.scorecard.box.Box;

import java.util.ArrayList;
import java.util.List;

public class SectionSorter
{
    private Box getMinBoxFromSeveralSections(List<Section> sections)
    {
        List<Box> minBoxes = new ArrayList<>();

        for (Section section : sections)
            minBoxes.add(getMinBoxFromOneSection(section));

        return getMinBoxFromListOfBox(minBoxes);
    }

    private Box getMinBoxFromOneSection(Section section)
    {
        Box minBox = section.getBoxList().get(0);
        int lowestValue = minBox.getValue();

        for (Box box : section.getBoxList())
        {
            int value = box.getValue();
            if (value < lowestValue)
            {
                lowestValue = value;
                minBox = box;
            }
        }
        return minBox;
    }

    private Box getMinBoxFromListOfBox(List<Box> boxes)
    {
        Box minBox = boxes.get(0);
        int lowestValue = minBox.getValue();

        for (Box box : boxes)
        {
            int value = box.getValue();
            if (value < lowestValue)
            {
                lowestValue = value;
                minBox = box;
            }
        }
        return minBox;
    }
}
