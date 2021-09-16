package Kniffel.scorecard.categoryBox;

import java.util.List;

public interface Description<T>
{
    boolean checkRequirementsMet(T valueToBeCheckedForMeetingRequirements);
}

