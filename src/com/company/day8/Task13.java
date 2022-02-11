package com.company.day8;

import com.company.utils.MyUtils;

public class Task13 {
    /**
     * 13.Given 3 numbers, print count of numbers that equals to each
     * other.(Input numbers from console)Example`
     * Input numbers`
     */

    public void equalNumbers() {
        System.out.println("Enter 3 numbers: ");
        int a = MyUtils.scan();
        int b = MyUtils.scan();
        int c = MyUtils.scan();
        int count = 0;
        if (a == b && a == c) {
            System.out.println(3);
        } else if (a != b && b != c) {
            System.out.println(count);
        } else {
            count++;
            System.out.println(count);
        }
    }
}
