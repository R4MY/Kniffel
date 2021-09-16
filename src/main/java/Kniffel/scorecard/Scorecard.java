package Kniffel.scorecard;

import Kniffel.scorecard.section.lowerSection.LowerSection;
import Kniffel.scorecard.section.upperSection.UpperSection;

import java.util.List;

public abstract class Scorecard
{
    private String playerName;
    private UpperSection upperSection;
    private LowerSection lowerSection;
    private List<PointsColumn> pointsColumns;

    public Scorecard(String playerName)
    {
        this.playerName = playerName;
//        this.upperSection = null;
//        this.lowerSection = null;
//        int i = 0;
//        while (i++ < 5)
//          PointsColumn.addEmptyPoints(this.upperSection, this.lowerSection);
    }
}
