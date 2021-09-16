package Kniffel.scorecard.categoryBox.categoryBoxes;

import Kniffel.scorecard.*;
import Kniffel.scorecard.categoryBox.Description;
import Kniffel.scorecard.categoryBox.Score;
import Kniffel.scorecard.section.bonus.Bonus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpperBonus implements Description, Score
{
    private String category;
    private String description;
    private String score;

    public UpperBonus(String category, String description, String score)
    {
        this.category = category;
        this.description = description;
        this.score = score;
    }

    // TODO IMPLEMENTATION
    @Override
    public boolean checkRequirementsMet(Object scorecard)
    {
        return scorecard
    }

    @Override
    public int calculateScore(List<Integer> currentThrow)
    {
        return 35;
    }

    @Override
    public boolean checkRequirementsMet(Object valueToBeCheckedForMeetingRequirements)
    {
        return false;
    }
}
