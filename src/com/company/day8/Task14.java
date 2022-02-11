package com.company.day8;

import com.company.utils.MyUtils;

public class Task14 {
    /**
     * Given 3 real numbers a, b, c.
     * FInd all decisions for ax2 + bx + c = 0.Print all decisions,
     * if there is not a decision, print “Can`t be”.
     */

    public void findAllDecision() {
        System.out.println("Enter numbers: ");
        int a = MyUtils.scan();
        int b = MyUtils.scan();
        int c = MyUtils.scan();
        double x;
        double x1;
        double x2;
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Can`t be");
        } else if (d == 0) {
            System.out.println("1");
            x = -b / 2 / a;
            System.out.println(x);
        } else {
            x1 = (-b - Math.sqrt(d)) / 2 / a;
            x2 = (-b + Math.sqrt(d)) / 2 / a;
            System.out.println(x1 + " " + x2);

        }
    }
}
