package Kniffel.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiceRollerTest
{

    @Test
    void rollD6()
    {
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100000000; i++)
        {
            integers.add(DiceRoller.rollD6());
        }

        double expected = 3.5;
        var actual = ((double) integers.stream()
                .reduce(0, Integer::sum)) / (double) integers.size();

        assertEquals(expected, actual, 0.001);
    }
}