package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by dangineering on 7/13/16.
 */
public class TextJustificationTest {
    int x, y;

    public static void main(String ... args) {
        TextJustification t = new TextJustification();

        List<String> l = new ArrayList<>();

        l.add("a");
        l.add("b");
        l.add("c");


        String[] w = new String[]{"This", "is", "an", "example", "of", "text", "justification."};

        System.out.println(t.fullJustify(w, 16));
    }
}
