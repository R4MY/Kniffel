package Kniffel.scorecard;

import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.section.LowerSection;
import Kniffel.scorecard.section.TotalsSection;
import Kniffel.scorecard.section.UpperSection;

import java.util.List;
//TODO MAYBE USE PROTOTYPE PATTERN + BUILDER PATTERN!
public abstract class Scorecard
{
    private String playerName;
    private UpperSection upperSection;
    private LowerSection lowerSection;
    private List<PointsColumn> pointsColumns;
    private TotalsSection totalsSection;

    public Scorecard(String playerName, UpperSection upperSection, LowerSection lowerSection, List<PointsColumn> pointsColumns, TotalsSection totalsSection)
    {
        this.playerName = playerName;
        this.upperSection = upperSection;
        this.lowerSection = lowerSection;
        this.pointsColumns = pointsColumns;
        this.totalsSection = totalsSection;
    }

    //    public Scorecard(String playerName)
//    {
//        this.playerName = playerName;
////        this.upperSection = null;
////        this.lowerSection = null;
////        int i = 0;
////        while (i++ < 5)
////          PointsColumn.addEmptyPoints(this.upperSection, this.lowerSection);
//    }
}
