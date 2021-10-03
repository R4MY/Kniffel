package Kniffel.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RollerTest
{

    @Test
    void rollAll()
    {
        var actual = Roller.rollAll();
        assertEquals(5, actual.size());
    }

    @ParameterizedTest
    @MethodSource("keepChosenDice")
    void keepChosenDice(List<Integer> currentThrow, List<Integer> diceNumbersToReroll)
    {
        Roller.keepChosenDice(currentThrow, diceNumbersToReroll);
        System.out.println(currentThrow + "SHOULD BE " + diceNumbersToReroll);
    }

    private static Stream<Arguments> keepChosenDice()
    {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of(1))
                ),
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of(1, 2))
                ),
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of(1, 2, 3))
                ),
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of(1, 2, 3, 4))
                ),
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of(1, 2, 3, 4, 5))
                ),
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of(1, 5))
                ),
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of())
                ),
                Arguments.of(
                        new ArrayList<>(List.of(10, 10, 10, 10, 10)),
                        new ArrayList<>(List.of(3))
                )
        );
    }
}