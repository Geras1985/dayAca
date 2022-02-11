package com.company.day8;

import com.company.utils.MyUtils;

public class Task11 {
    /**
     * Given coordinates of two points in the coordinate plane.
     * Write java program to check if the points lie in the same plane? (quarter)
     * - Print In the same quarter , else print Not in the same quarter.
     * - Input 4 coordinates from console, all 4 coordinates != 0.
     */

    public void quarter(){
        double x1 = 2, x2 = 5, y1=3, y2 =6;
        double x=4, y=5;
        if (x>=x1 && x<=x2 && y>=y1 && y<=y2){
            if ((x2-x1)/(x-x1)==(y2-y1)/(y-y1)){
                System.out.println("Yes");
            }else System.out.println("No");
        }else System.out.println("No");
    }
}

