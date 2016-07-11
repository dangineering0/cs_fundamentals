package com.company.DS;

import java.util.Iterator;

/**
 * Created by dangineering on 7/10/16.
 */
public class MaxHeapTest {
    public static void main(String[] args) {

        MaxHeap<Integer> maxHeap = new MaxHeap<>(2);

        maxHeap.insert(10);
        maxHeap.insert(1);

        maxHeap.insert(2);
        maxHeap.insert(3);

        Iterator it = maxHeap.iterator();

        while(it.hasNext()) {
            System.out.print("iter : " + it.next() + " ");
        }
    }
}
