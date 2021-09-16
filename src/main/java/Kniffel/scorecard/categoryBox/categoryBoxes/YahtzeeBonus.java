package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.categoryBox.CategoryBox;
import org.springframework.beans.factory.annotation.Value;

public class YahtzeeBonus extends
{
    public YahtzeeBonus(@Value("${yahtzee.categoryBoxes.threeOfAKind.category}") String category,
                        @Value("${yahtzee.categoryBoxes.threeOfAKind.description}") String description,
                        @Value("${yahtzee.categoryBoxes.threeOfAKind.score}") String score)
    {
        super(category, description, score);
    }
}
