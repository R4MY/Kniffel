package Kniffel.scorecard;

import java.util.ArrayList;
import java.util.List;

public class ScorecardListBuilder
{
    private List<Scorecard> listOfScorecard;

    public ScorecardListBuilder addList()
    {
        listOfScorecard = new ArrayList<>();
        return this;
    }

    public ScorecardListBuilder addScorecard(Scorecard scorecard)
    {
        listOfScorecard.add(scorecard);
        return this;
    }

    public ScorecardListBuilder addScorecard()
    {
        return new ScorecardListBuilder();
    }

    public List<Scorecard> buildList()
    {
        return listOfScorecard;
    }
}
