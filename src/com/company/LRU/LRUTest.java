package com.company.LRU;

import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by dangineering on 7/9/16.
 */

public class LRUTest {
    public static void main(String[] args){
        LRUCache lru = new LRUCache(2);


        set(lru, 2, 1);
        set(lru, 1, 1);

//        lru.set(1, 1);
//        lru.get(2);
//        lru.set(4,1);
//        lru.get(1);
//        lru.get(2);
    }

    private static void print(LRUCache.DDIterator d) {

        while(d.hasNext()) {
            LRUCache.DoublyLinkedList dd = d.next();
            System.out.print("key: " + dd.key + " val: " + dd.val + " ==> ");
        }
    }

    private static void set(LRUCache lru, int key, int val) {
        lru.set(key, val);
        print(lru.iterator());
    }


}
