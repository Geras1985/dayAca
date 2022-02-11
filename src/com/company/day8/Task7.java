package com.company.day8;

import java.util.Random;

public class Task7 {
    /**
     * Write a Java program that keeps a number from the user and generates an
     * integer between 1 and 7 and displays the name of the weekday.
     * */
    public void weekDay() {
        int min = 1;
        int max = 7;
        Random random = new Random();
        int i = random.nextInt(max - min + 1) + min;
        switch (i){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");

        }
    }
}
