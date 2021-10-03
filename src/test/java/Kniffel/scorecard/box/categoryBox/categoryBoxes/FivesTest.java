package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FivesTest
{

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new Fives().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,3,4,5), 5
                ),
                Arguments. of (
                        List. of (5,2,3,4,5), 10
                ),
                Arguments. of (
                        List. of (1,2,5,5,5), 15
                ),
                Arguments. of (
                        List. of (2, 1, 3, 1, 1), 0
                ),
                Arguments. of (
                        List. of (5,4,3,1,1), 5
                ),
                Arguments. of (
                        List. of (2,5,5,5,5), 20
                ),
                Arguments. of (
                        List. of (5,5,5,5,5), 25
                ),
                Arguments. of (
                        List. of (5,6,5,6,6), 10
                )
        );
    }
}