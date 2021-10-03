package Kniffel.scorecard.box.totalsBox.totalsBoxes;

import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.box.totalsBox.TotalsBox;
import Kniffel.service.PointsCalculator;

public class TotalOfUpperSection extends TotalsBox
{
    TotalOfUpperSection(String category, String calculatedScore)
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
        return PointsCalculator.getTotalOfUpperSection((Scorecard) scorecard);
    }

    @Override
    public int getValue()
    {
        return 90;
    }
}
