package Kniffel.scorecard.box.categoryBox.categoryBoxes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreesTest
{

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate(List<Integer> integers, int expected)
    {
        int actual = new Threes().calculate(integers);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> calculate()
    {
        return Stream. of (
                Arguments. of (
                        List. of (2, 2, 3, 4, 5), 3
                ),
                Arguments. of (
                        List. of (1,2,3,3,5), 6
                ),
                Arguments. of (
                        List. of (3,3,3,4,5), 9
                ),
                Arguments. of (
                        List. of (3,1,3,3,3), 12
                ),
                Arguments. of (
                        List. of (3,3,3,3,3), 15
                ),
                Arguments. of (
                        List. of (2,2,3,4,1), 3
                ),
                Arguments. of (
                        List. of (2,2,6,1,5), 0
                ),
                Arguments. of (
                        List. of (2,2,2,2,2), 0
                )
        );
    }
}