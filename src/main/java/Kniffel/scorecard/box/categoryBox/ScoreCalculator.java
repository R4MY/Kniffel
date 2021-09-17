package Kniffel.scorecard.box.categoryBox;

import java.util.List;

public interface ScoreCalculator<T>
{
    int calculate(T currentThrow);
    boolean check(T valueToBeCheckedForMeetingRequirements);
}
