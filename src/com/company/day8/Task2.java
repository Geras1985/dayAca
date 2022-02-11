package com.company.day8;

import com.company.utils.MyUtils;

public class Task2 {
    /**
     * Write a Java program to determine whether an input number is an
     * even number.
     * */
    public void isEven() {
        System.out.println("Please enter the number: ");
        int number = MyUtils.scan();
        boolean valid = MyUtils.isEven(number);
        if (valid){
            System.out.println("The number is even.");
        }else {
            System.err.println("The number is not even.");
        }
    }
}
