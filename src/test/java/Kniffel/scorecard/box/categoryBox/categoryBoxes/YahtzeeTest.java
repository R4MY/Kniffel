package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YahtzeeTest
{

    @ParameterizedTest
    @MethodSource("check")
    void check(List<Integer> integers, boolean expected)
    {
        var actual = new Yahtzee().check(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> check()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,2,2,2), true
                ),
                Arguments. of (
                        List. of (4,4,4,4,4), true
                ),
                Arguments. of (
                        List. of (1,1,1,1,1), true
                ),
                Arguments. of (
                        List. of (3,3,3,3,3), true
                ),
                Arguments. of (
                        List. of (5,5,5,5,5), true
                ),
                Arguments. of (
                        List. of (6,6,6,6,6), true
                ),
                Arguments. of (
                        List. of (2,2,2,3,2), false
                ),
                Arguments. of (
                        List. of (8,8,8,8,4), false
                ),
                Arguments. of (
                        List. of (1,2,3,4,4), false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new Yahtzee().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,3,4,5), 0
                ),
                Arguments. of (
                        List. of (1,2,3,4,5), 0
                ),
                Arguments. of (
                        List. of (1,2,1,4,5), 0
                ),
                Arguments. of (
                        List. of (2,1,3,1,1), 0
                ),
                Arguments. of (
                        List. of (1,1,1,1,1), 50
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 50
                ),
                Arguments. of (
                        List. of (3,3,3,3,3), 50
                ),
                Arguments. of (
                        List. of (4,4,4,4,4), 50
                ),
                Arguments. of (
                        List. of (5,5,5,5,5), 50
                ),
                Arguments. of (
                        List. of (6,6,6,6,6), 50
                )
        );
    }
}