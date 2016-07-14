package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dangineering on 7/13/16.
 */
public class Vector2DTest {

    public static void main(String ... args) {


/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */

        List<List<Integer>> a = new ArrayList<>();

        List<Integer> m = new ArrayList<>();
        a.add(m);

        List<Integer> ff = new ArrayList<>();
        ff.add(0);
        ff.add(1);

        a.add(ff);

        List<Integer> k = new ArrayList<>();
        k.add(4);
        k.add(6);

        a.add(k);


        List<Integer> l = new ArrayList<>();

        Vector2D i = new Vector2D(a);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
