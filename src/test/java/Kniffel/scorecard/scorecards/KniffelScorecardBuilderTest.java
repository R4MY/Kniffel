package Kniffel.scorecard.scorecards;

import org.junit.jupiter.api.Test;

class KniffelScorecardBuilderTest
{
    @Test
    void build()
    {
        KniffelScorecard kniffelScorecard = new KniffelScorecardBuilder().build();
        System.out.println(kniffelScorecard);
    }
}