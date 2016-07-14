package com.company;

import java.util.Iterator;
import java.util.List;

/**
 * Created by dangineering on 7/13/16.
 */
public class Vector2D implements Iterator<Integer> {
    List<List<Integer>> vec2d;

    int x = 0;
    int y = 0;

    public Vector2D(List<List<Integer>> vec2d) {
        this.vec2d = vec2d;
        if (vec2d.size() > 0) {
            y = 0;
            if (vec2d.get(0).size()>=0) x = 0;
        }
    }

    @Override
    public Integer next() {
        return vec2d.get(y).get(x++);
    }

    @Override
    public boolean hasNext() {
        while (y < vec2d.size()) {
            if (x < vec2d.get(y).size()) {
                return true;
            } else {
                y++;
                x = 0;
            }
        }
        return false;

    }
}
