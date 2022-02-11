package com.company.day8;

import com.company.utils.MyUtils;

public class Task15 {
    /**
     * Given 3 integer values arrange them in non-decreasing order.
     */
    public void nonDecreasing() {
        System.out.println("Enter the numbers: ");
        int a = MyUtils.scan();
        int b = MyUtils.scan();
        int c = MyUtils.scan();
        if (a >= b && b > c) {
            System.out.println(c + " " + b + " " + a);
        } else if (a >= b && a < c) {
            System.out.println(b + " " + a + " " + c);
        } else if (a >= c && a < b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c >= b && b > a) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= c && c > b) {
            System.out.println(b + " " + c + " " + a);
        } else if (c > a) {
            System.out.println(a + " " + c + " " + b);
        }
    }
}
