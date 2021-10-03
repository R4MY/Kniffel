package Kniffel.service;

import java.util.Arrays;
import java.util.List;

public class Roller
{
    public static List<Integer> rollAll()
    {
        return Arrays.asList(
                DiceRoller.rollD6(),
                DiceRoller.rollD6(),
                DiceRoller.rollD6(),
                DiceRoller.rollD6(),
                DiceRoller.rollD6());
    }

    public static void keepChosenDice(List<Integer> currentThrow, List<Integer> diceNumbersToReroll)
    {
        for (int i = 1; i <= currentThrow.size(); i++)
        {
            if (!diceNumbersToReroll.contains(i))
                currentThrow.set(i - 1, DiceRoller.rollD6());
        }
    }
}
