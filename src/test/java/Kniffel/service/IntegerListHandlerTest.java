package Kniffel.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerListHandlerTest
{

    @ParameterizedTest
    @MethodSource("checkHasNumberMinimumTheAmountOfTimes")
    void checkHasNumberMinimumTheAmountOfTimes(List<Integer> numbers, int number, int times, boolean expected)
    {
        var actual = IntegerListHandler.checkHasNumberMinimumTheAmountOfTimes(numbers, number, times);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> checkHasNumberMinimumTheAmountOfTimes()
    {
        return Stream.of(
                Arguments. of (
                        List. of (1,1,2,1,1), 2, 1, true
                ),
                Arguments. of (
                        List. of (3,2,4,4,5), 4, 2, true
                ),
                Arguments. of (
                        List. of (3,3, 8,4,3), 3, 3, true
                ),
                Arguments. of (
                        List. of (6,6,6,6,6), 6, 4, true
                ),
                Arguments. of (
                        List. of (5,5,5,5,5), 5, 5, true
                ),
                Arguments. of (
                        List. of (2,3,4,5,6, 7, 8, 9, 10, 11), 10, 1, true
                ),
                Arguments. of (
                        List. of (2,2,2,1,2), 1, 1, true
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 2, 10, false
                ),
                Arguments. of (
                        List. of (1,2,1,4,5), 3, 1, false
                ),
                Arguments. of (
                        List. of (2,1,3,1,1), 4, 6, false
                ),
                Arguments. of (
                        List. of (1,1,3,1,1), 6, 1, false
                ),
                Arguments. of (
                        List. of (2,2,3,4,1), 10, 1, false
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 0, 1, false
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), -1, 1, false
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 5, -1, true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("checkHasSequenceOfMinimumTheLength")
    void checkHasSequenceOfMinimumTheLength(List<Integer> numbers, int lengthOfSequence, boolean expected)
    {
        var actual = IntegerListHandler.checkHasSequenceOfMinimumTheLength(numbers, lengthOfSequence);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> checkHasSequenceOfMinimumTheLength()
    {
        return Stream.of(
                Arguments. of (
                        List. of (1,1,2,1,1), 1, true
                ),
                Arguments. of (
                        List. of (4,2,4,4,5), 2, true
                ),
                Arguments. of (
                        List. of (3,2, 1,4,5), 3, true
                ),
                Arguments. of (
                        List. of (2,4,3,6,1), 4, true
                ),
                Arguments. of (
                        List. of (2,1,4,5,3), 5, true
                ),
                Arguments. of (
                        List. of (2,3,4,5,6, 7, 8, 9, 10, 11), 10, true
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 1, true
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 2, false
                ),
                Arguments. of (
                        List. of (1,2,1,4,5), 3, false
                ),
                Arguments. of (
                        List. of (2,1,3,1,1), 4, false
                ),
                Arguments. of (
                        List. of (1,1,3,1,1), 5, false
                ),
                Arguments. of (
                        List. of (2,2,3,4,1), 10, false
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 0, true
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), -1, true
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 27, false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("createFromZeroToNumber")
    void createFromZeroToNumber(int number, List<Integer> expected) throws Exception
    {
        var actual = IntegerListHandler.createFromZeroToNumber(number);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> createFromZeroToNumber()
    {
        return Stream. of (
                Arguments. of (
                        5, List. of (0,1,2,3,4, 5)
                ),
                Arguments. of (
                        4, List. of (0,1,2,3,4)
                ),
                Arguments. of (
                        3, List. of (0,1,2,3)
                ),
                Arguments. of (
                        2, List. of (0,1,2)
                ),
                Arguments. of (
                        1, List. of (0,1)
                ),
                Arguments. of (
                        -4, new ArrayList<Integer>()
                ),
                Arguments. of (
                        0, List.of(0)
                )
        );
    }
}