package Kniffel.scorecard;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.scorecard.section.lowerSection.LowerSection;
import Kniffel.scorecard.section.upperSection.UpperSection;

public class KniffelScorecard extends Scorecard
{
    private CategoryBox bonusUpperSection;

    public KniffelScorecard(String playerName, UpperSection upperSection, LowerSection lowerSection, CategoryBox bonusUpperSection)
    {
        super(playerName, upperSection, lowerSection);
        this.bonusUpperSection = bonusUpperSection;
    }
}
