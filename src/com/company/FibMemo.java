package com.company;

/**
 * Created by dangineering on 7/14/16.
 */
public class FibMemo {

    public int fibRecurse(int i) {
        if (i == 0 || i == 1) {
           return i;
        } else {
            int fib = fibRecurse(i-1) + fibRecurse(i-2);
            return fib;
        }
    }


    /** utilizes top down approach */

    public int fibMemo(int n) {

        // setup
        int[] cache = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        return fibMemoHelper(cache, n);
    }

    private int fibMemoHelper(int[] cache, int n) {
        if (n==0||n==1) return n;
        if (cache[n] != 0) return cache[n];
        int res = fibMemoHelper(cache, n-1) + fibMemoHelper(cache, n-2);
        cache[n]= res;
        return res;
    }

    /** bottom up iteratively **/
    public int bottomUpFib(int n) {

        int[] cache = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i =2; i<= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    /** bottom up iteratively **/
    public int bottomUpFibSingle(int n) {
        if (n == 0 || n ==1) return n;
        int prevPrev = 0;
        int prev = 1;
        int cur = 0;
        for (int i= 2; i<=n; i++) {
            cur = prevPrev + prev;
            prevPrev = prev;
            prev = cur;

        }
        return cur;
    }
}
