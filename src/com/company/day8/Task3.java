package com.company.day8;

import java.util.Random;

public class Task3 {
    /**
     * Generate and print random integer number between 2 and 7(not using
     * bound)
     */
    public void randomNumber() {
        int min = 2;
        int max = 7;
        Random random = new Random();
        int i = random.nextInt(max - min + 1) + min;
        System.out.println(i);
    }
}
