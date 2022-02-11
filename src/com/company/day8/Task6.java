package com.company.day8;

import com.company.utils.MyUtils;

public class Task6 {
    /**
     * Write a Java program that reads a floating-point number and prints "zero"
     * if the number is zero. Otherwise, print "positive" or "negative".
     * Add "small" if the absolute value of the number is less than 1, or "large"
     * if it exceeds 1,000,000 (use Math.abs() for absolute value)
     */
    public void readsFloatingPoint() {
        System.out.println("Please enter the number: ");
        double a = MyUtils.scan();
        if (a == 0) {
            System.out.println("zero");
        } else if (a < 0) {
            if (Math.abs(a) < 1)
                System.out.println("The number is negative and small than 1");
            else {
                System.out.println("The number is negative");
            }
        } else {
            if (Math.abs(a) > 1000000)
                System.out.println("The number is positive and large than 1000000");
            else {
                System.out.println("The number is positive");
            }
        }
    }
}
