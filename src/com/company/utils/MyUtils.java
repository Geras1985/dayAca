package com.company.utils;

import com.company.day8.*;

import java.util.Scanner;

public class MyUtils {

    /**
     * The method calls a scanner
     */
    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * The method determines whether the number is greater or equal 18 and return true.
     */
    public static boolean isValid(int a) {
        return a >= 18;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isMultipleFive(int number) {
        return number % 5 == 0;
    }


    public static void chooseTheTask() {
        System.out.println("Please enter your task number: ");
        int a = scan();
        switch (a) {
            case 1:
                Task1 task1 = new Task1();
                task1.vote();
                break;
            case 2:
                Task2 task2 = new Task2();
                task2.isEven();
                break;
            case 3:
                Task3 task3 = new Task3();
                task3.randomNumber();
                break;
            case 4:
                Task4 task4 = new Task4();
                task4.multipleFive();
                break;
            case 5:
                Task5 task5 = new Task5();
                task5.greatest();
                break;
            case 6:
                Task6 task6 = new Task6();
                task6.readsFloatingPoint();
                break;
            case 7:
                Task7 task7 = new Task7();
                task7.weekDay();
                break;
            case 8:
                Task8 task8 = new Task8();
                task8.iceCream();
                break;
            case 9:
                Task9 task9 = new Task9();
                task9.leapYear();
                break;
            case 10:
                Task10 task10 = new Task10();
                task10.odd();
                break;
            case 11:
                Task11 task11  =new Task11();
                task11.quarter();
                break;
            case 12:
                Task12 task12 = new Task12();
                task12.triangle();
                break;
            case 13:
                Task13 task13 = new Task13();
                task13.equalNumbers();
                break;
            case 14:
                Task14 task14 = new Task14();
                task14.findAllDecision();
                break;
            case 15:
                Task15 task15 = new Task15();
                task15.nonDecreasing();
                break;
            default:
                System.out.println("Good Bye");
        }
    }
}
