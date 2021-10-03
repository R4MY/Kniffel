package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FullHouseTest
{

    @ParameterizedTest
    @MethodSource("check")
    void check(List<Integer> integers, boolean expected)
    {
        var actual = new FullHouse().check(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> check()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,4,4,2), true
                ),
                Arguments. of (
                        List. of (1,1,3,1,3), true
                ),
                Arguments. of (
                        List. of (1,1,1,1,1), false
                ),
                Arguments. of (
                        List. of (6,3,6,3,3), true
                ),
                Arguments. of (
                        List. of (5,5,5,1,1), true
                ),
                Arguments. of (
                        List. of (6,6,2,2,6), true
                ),
                Arguments. of (
                        List. of (4,2,2,2,4), true
                ),
                Arguments. of (
                        List. of (2,2,4,3,4), false
                ),
                Arguments. of (
                        List. of (8,1,1,8,4), false
                ),
                Arguments. of (
                        List. of (1,1,3,1,1), false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new FullHouse().calculate(integers);
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
                        List. of (1,3,3,1,1), 25
                ),
                Arguments. of (
                        List. of (5,5,5,1,1), 25
                ),
                Arguments. of (
                        List. of (3,5,5,3,3), 25
                ),
                Arguments. of (
                        List. of (6,4,4,6,6), 25
                )
        );
    }
}