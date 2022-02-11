package com.company.day8;

import com.company.utils.MyUtils;

public class Task5 {
    /**
     * Take three numbers from the user and print the greatest number.
     */
    public void greatest() {
        System.out.println("Please enter 3 numbers: ");
        int a = MyUtils.scan();
        int b = MyUtils.scan();
        int c = MyUtils.scan();
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else System.out.println(c);
    }
}
