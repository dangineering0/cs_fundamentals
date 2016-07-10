package com.company.algo;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by dangineering on 7/4/16.
 */
public class MoveZeroes {
    static LinkedHashSet l = new LinkedHashSet();

    public static void main(String[] args) {
        j();
    }

    static void j(){
        l.add("1");
        l.add("2");

        Iterator i = l.iterator();
        while(i.hasNext()) {
            l.remove(i.next());
        }
    }

}
