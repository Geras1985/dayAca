package com.company.day8;

import com.company.utils.MyUtils;

public class Task9 {
    /**
     * Write a Java program that takes a year from the user and print whether
     * that year is a leap year or not.
     * */

    public void leapYear(){
        System.out.println("Please enter the year: ");
        int year = MyUtils.scan();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Leap year");
                }
                else System.out.println("Not a Leap year");
            }else System.out.println("Leap year");
        }else System.out.println("Not a Leap year");
    }
}
