package Kniffel.service;

import Kniffel.service.DiceRoller;

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

    public static void rerollChosenDice(List<Integer> currentThrow, List<Integer> diceNumbersToReroll)
    {
        for (Integer integer : diceNumbersToReroll)
        {
            currentThrow.set(integer, DiceRoller.rollD6());
        }
    }
}
