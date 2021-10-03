package Kniffel.scorecard.box.totalsBox.totalsBoxes;

import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.box.totalsBox.TotalsBox;
import Kniffel.service.PointsCalculator;

public class TotalOfLowerSection extends TotalsBox
{
    TotalOfLowerSection(String category, String calculatedScore)
    {
        super(category, calculatedScore);
    }

    @Override
    public boolean check(Object valueToBeCheckedForMeetingRequirements)
    {
        return true;
    }

    @Override
    public int calculate(Object scorecard)
    {
        return PointsCalculator.getTotalOfLowerSection((Scorecard) scorecard);
    }

    @Override
    public int getValue()
    {
        return 180;
    }
}
