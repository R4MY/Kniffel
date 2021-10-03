package Kniffel.service;

import java.util.Scanner;

public class CheckpointPerformer
{
    public static void perform()
    {
        Scanner keyIn = new Scanner(System.in);

        System.out.print("Press the enter key to continue");
        keyIn.nextLine();
        clearScreen();
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
