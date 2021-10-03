package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigStraightTest
{

    @ParameterizedTest
    @MethodSource("check")
    void check(List<Integer> integers, boolean expected)
    {
        var actual = new BigStraight().check(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> check()
    {
        return Stream. of (
                Arguments. of (
                        List. of (1,2,3,4,5), true
                ),
                Arguments. of (
                        List. of (4,2,1,5,3), true
                ),
                Arguments. of (
                        List. of (4,2,1,5,6), false
                ),
                Arguments. of (
                        List. of (2,5,3,4,6), true
                ),
                Arguments. of (
                        List. of (2,2,4,3,4), false
                ),
                Arguments. of (
                        List. of (8,1,1,8,4), false
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
        int actual = new BigStraight().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (1,2,3,4,5), 40
                ),
                Arguments. of (
                        List. of (1,4,3,2,5), 40
                ),
                Arguments. of (
                        List. of (6,5,4,3,2), 40
                ),
                Arguments. of (
                        List. of (2,1,3,1,1), 0
                ),
                Arguments. of (
                        List. of (1,1,3,1,1), 0
                ),
                Arguments. of (
                        List. of (2,2,2,4,2), 0
                ),
                Arguments. of (
                        List. of (3,3,3,3,3), 0
                ),
                Arguments. of (
                        List. of (6,4,2,6,6), 0
                )
        );
    }
}