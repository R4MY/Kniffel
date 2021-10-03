package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest
{

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new Chance().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,3,4,5), 16
                ),
                Arguments. of (
                        List. of (1,5,3,4,6), 19
                ),
                Arguments. of (
                        List. of (3,2,6,4,5), 20
                ),
                Arguments. of (
                        List. of (2,1,3,1,1), 8
                ),
                Arguments. of (
                        List. of (1,1,3,1,1), 7
                ),
                Arguments. of (
                        List. of (2,2,1,1,1), 7
                ),
                Arguments. of (
                        List. of (6,6,6,6,6), 30
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 10
                )
        );
    }
}