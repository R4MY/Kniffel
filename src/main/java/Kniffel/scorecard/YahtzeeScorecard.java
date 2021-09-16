package Kniffel.scorecard;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.scorecard.section.lowerSection.LowerSection;
import Kniffel.scorecard.section.upperSection.UpperSection;

public class YahtzeeScorecard extends KniffelScorecard
{
    private CategoryBox bonusLowerSection;

    public YahtzeeScorecard(String playerName, UpperSection upperSection, LowerSection lowerSection, CategoryBox bonusUpperSection, CategoryBox bonusLowerSection)
    {
        super(playerName, upperSection, lowerSection, bonusUpperSection);
        this.bonusLowerSection = bonusLowerSection;
    }
}
