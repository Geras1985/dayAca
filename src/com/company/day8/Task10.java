package com.company.day8;

import com.company.utils.MyUtils;

public class Task10 {
    /**
     * If one of them is multiple of 7, and both positive, and a
     * greater than b, print all odd values between them
     * - else print all even values between them
     */
    public void odd() {
        System.out.println("Enter the numbers: ");
        int a = MyUtils.scan();
        int b = MyUtils.scan();
        if (a % 7 == 0 || b % 7 == 0 && b > 0 && a > b) {
            for (int i = b + 1; i < a; i++) {
                if (i % 2 == 1)
                    System.out.println(i);
            }
            System.out.println("a < b or the number is not multiple of 7");
        }
    }
}
