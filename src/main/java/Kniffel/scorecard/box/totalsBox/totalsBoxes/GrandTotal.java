package Kniffel.scorecard.box.totalsBox.totalsBoxes;

import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.box.totalsBox.TotalsBox;
import Kniffel.service.PointsCalculator;

public class GrandTotal extends TotalsBox
{
    GrandTotal(String category, String calculatedScore)
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
        return PointsCalculator.getGrandTotal((Scorecard) scorecard);
    }

    @Override
    public int getValue()
    {
        return 200;
    }
}
