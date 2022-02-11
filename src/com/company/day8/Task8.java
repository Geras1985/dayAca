package com.company.day8;

import com.company.utils.MyUtils;

public class Task8 {
    /**
     * The ice cream parlor sells three balls and five balls. Can you buy
     * exactly k balls of ice cream?
     * In the caffe they sell an ice-cream with 3 balls and 5 balls.Input K integer
     * value from console, check if you can buy exactly K balls ice-cream.
     */

    public void iceCream() {
        System.out.println("Enter the number of ice creams: ");
        int a = MyUtils.scan();
        if (a < 3 || a == 4 || a == 7) {
            System.out.println("false");
        } else System.out.println("true");
    }
}