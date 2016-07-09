package com.company.LRU;

import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by dangineering on 7/9/16.
 */

public class LRUTest {
    public static void main(String[] args){
        LRUCache lru = new LRUCache(2);


        lru.set(0, 10000);
        lru.set(1, 20000);
        lru.set(2, 30000);

    }
}
