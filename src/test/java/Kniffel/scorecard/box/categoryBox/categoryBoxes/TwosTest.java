package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwosTest
{

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new Twos().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2,2,3,4,5), 4
                ),
                Arguments. of (
                        List. of (1,2,3,4,5), 2
                ),
                Arguments. of (
                        List. of (1,2,1,4,5), 2
                ),
                Arguments. of (
                        List. of (2, 2, 2, 1, 1), 6
                ),
                Arguments. of (
                        List. of (1,2,2,2,2), 8
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 10
                ),
                Arguments. of (
                        List. of (2,2,3,1,5), 4
                ),
                Arguments. of (
                        List. of (6,4,2,2,2), 6
                )
        );
    }
}