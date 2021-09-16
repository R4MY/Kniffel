package Kniffel.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DiceRoller
{
    public static List<Integer> d6 = List.of(1, 2, 3, 4, 5, 6);
    public static Integer rollD6()
    {
        Random random = new Random();

        return random.nextInt(6) + 1;
    }
}
