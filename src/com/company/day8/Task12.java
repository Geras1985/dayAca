package com.company.day8;

import com.company.utils.MyUtils;

import java.util.Scanner;

public class Task12 {
    /**
     * Given 3 positive numbers different from 0, Determine if there is
     * a non-degenerate triangle with such sides.
     * - Input numbers from console
     * */
    public void triangle(){
        System.out.println("Enter 3 numbers different from 0: ");
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double x2= scan.nextDouble();
        double x3 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double y3 = scan.nextDouble();

        if (x1!=x2 && x1!=x3 && x2!=x3 && y1!=y2 && y1!=y3 && y2!=y3){
            if ((x3-x2)/(x3-x1)==(y3-y2)/(y3-y1) &&
                    (x2-x1)/(x3-x1)==(y2-y1)/(y3-y1)){
                System.out.println("No");
            }else System.out.println("Yes");
        }else System.out.println("No");
    }
}
