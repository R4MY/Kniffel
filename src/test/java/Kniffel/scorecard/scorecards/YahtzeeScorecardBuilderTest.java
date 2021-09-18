package Kniffel.scorecard.scorecards;

import org.junit.jupiter.api.Test;

class YahtzeeScorecardBuilderTest
{

    @Test
    void build()
    {
        YahtzeeScorecard yahtzeeScorecard = new YahtzeeScorecardBuilder().build();
        System.out.println(yahtzeeScorecard);
    }
}