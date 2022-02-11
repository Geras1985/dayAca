package com.company.day8;

import com.company.utils.MyUtils;

public class Task4 {
    /**
     * Write a Java program to determine whether an input number is a
     * multiple of a 5.
     */
    public void multipleFive() {
        System.out.println("Please enter the number: ");
        int number = MyUtils.scan();
        boolean valid = MyUtils.isMultipleFive(number);
        if (valid){
            System.out.println("Number is a multiple of a 5");
        } else {
            System.err.println("Number is not multiple of a 5");
        }
    }

}
