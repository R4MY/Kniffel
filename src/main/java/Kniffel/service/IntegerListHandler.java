package Kniffel.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IntegerListHandler
{
    public static boolean checkHasNumberTheAmountOfTimes(List<Integer> numbers, int number, int times)
    {
        return numbers.stream()
                .filter(n -> n.equals(number))
                .count() == times;
    }

    public static boolean checkHasSequenceOfMinimumTheLength(List<Integer> numbers, int lengthOfSequence)
    {
        return numbers.stream()
                .anyMatch(n -> createFromZeroToNumber(lengthOfSequence).stream()
                        .allMatch(i -> numbers.contains(n + i)));
    }

    //    ALTERNATIVE IMPLEMENTATION
//    public static boolean checkHasSequenceOfMinimumTheLength(List<Integer> numbers, int lengthOfSequence)
//    {
//        boolean hasDesiredSequence = false;
//
//        for (Integer integer : numbers)
//        {
//            int sequenceCount = 0;
//
//            for (int i = 0; i < lengthOfSequence; i++)
//            {
//                if (numbers.contains(integer + i))
//                    sequenceCount++;
//                else
//                    break;
//            }
//
//            if (sequenceCount == lengthOfSequence)
//            {
//                hasDesiredSequence = true;
//                break;
//            }
//        }
//
//        return hasDesiredSequence;
//    }

    public static List<Integer> createFromZeroToNumber(int number)
    {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i <= number; i++)
        {
            output.add(i);
        }
        return output;
    }
}
