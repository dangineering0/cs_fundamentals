package com.company;

/**
 * Created by dangineering on 7/15/16.
 */
public class Multiply {

    public int mult(int a,int b){
        boolean isNeg = b <0;
        b = Math.abs(b);
        int res = multH(a,b);
        if (isNeg) return res*-1;
        return res;
    }

    public int multH(int a, int b) {
        boolean isEven = (b%2) == 0;
        if (b == 0) return 0;
        if (b ==1) return a;

        int half = multH(a, b >> 1);

        if (isEven) return half+half;
        return half+half+a;
    }
}
