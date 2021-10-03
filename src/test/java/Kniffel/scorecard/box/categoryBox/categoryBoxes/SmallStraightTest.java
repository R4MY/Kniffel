package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallStraightTest
{
    @ParameterizedTest
    @MethodSource("check")
    void check(List<Integer> integers, boolean expected)
    {
        var actual = new SmallStraight().check(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> check()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,3,4,5,2), true
                ),
                Arguments. of (
                        List. of (4,3,5,6,4), true
                ),
                Arguments. of (
                        List. of (1,2,3,4,1), true
                ),
                Arguments. of (
                        List. of (5,3,4,1,2), true
                ),
                Arguments. of (
                        List. of (2,2,4,3,4), false
                ),
                Arguments. of (
                        List. of (8,1,1,8,4), false
                ),
                Arguments. of (
                        List. of (1,2,3,1,4), true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new SmallStraight().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,3,4,5), 30
                ),
                Arguments. of (
                        List. of (1,2,6,4,5), 0
                ),
                Arguments. of (
                        List. of (1,2,1,4,5), 0
                ),
                Arguments. of (
                        List. of (2,1,3,1,1), 0
                ),
                Arguments. of (
                        List. of (1,1,3,1,1), 0
                ),
                Arguments. of (
                        List. of (2,3,2,4,5), 30
                ),
                Arguments. of (
                        List. of (3,5,3,6,4), 30
                ),
                Arguments. of (
                        List. of (1,4,2,3,6), 30
                )
        );
    }
}