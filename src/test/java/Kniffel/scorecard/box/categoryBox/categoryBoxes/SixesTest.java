package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SixesTest
{

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new Sixes().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,3,4,5), 0
                ),
                Arguments. of (
                        List. of (6,2,6,4,5), 12
                ),
                Arguments. of (
                        List. of (1,6,1,4,5), 6
                ),
                Arguments. of (
                        List. of (2,6,6,6,6), 24
                ),
                Arguments. of (
                        List. of (6,6,6,6,6), 30
                ),
                Arguments. of (
                        List. of (2,6,3,4,1), 6
                ),
                Arguments. of (
                        List. of (2,2,3,1,5), 0
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 0
                )
        );
    }
}