package com.company.day8;

import com.company.utils.MyUtils;

public class Task1 {
    /**
     * Write a Java program to allow the user to input his/her age. Then the
     * program will show if the person is eligible to vote. A person who is
     * eligible to vote must be older than or equal to 18 years old.
     */
    public void vote() {
        System.out.println("Please enter the age of person: ");
        int age = MyUtils.scan();
        boolean valid = MyUtils.isValid(age);
        if (valid){
            System.out.println("The person is eligible to vote.");
        }else {
            System.err.println("The person is not eligible to vote.");
        }
    }
}
