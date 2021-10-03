package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoursTest
{

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new Fours().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,3,4,5), 4
                ),
                Arguments. of (
                        List. of (1,2,4,4,5), 8
                ),
                Arguments. of (
                        List. of (4,4,1,4,5), 12
                ),
                Arguments. of (
                        List. of (4,4,4,1,4), 16
                ),
                Arguments. of (
                        List. of (4,4,4,4,4), 20
                ),
                Arguments. of (
                        List. of (2,4,3,4,1), 8
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