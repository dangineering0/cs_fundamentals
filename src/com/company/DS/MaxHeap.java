package com.company.DS;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by dangineering on 7/10/16.
 */
public class MaxHeap<Key extends Comparable<Key>> implements Iterable<Key> {
    private Key[] pq;
    private int n; // default value of all ints in 0;
    private int capacity;
    private boolean debug = true;

    public MaxHeap(int capacity) {
        pq = (Key[]) new Comparable[capacity+1];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Key getMax() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException();
        return pq[1];
    }

    public Key delMax() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException();

        Key max = pq[1];
        exch(1, n--);
        sink(1);
        pq[n+1] = null;
        if(debug) System.out.println("deleting max.. " + max.toString());
        return max;
    }

    public void insert(Key x) {
        if (n==capacity) {
            if(debug) System.out.println("over cap. deleting max");
            delMax();
        }

        pq[++n] = x;
        swim(n);
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }

    private void sink(int k) {
        while(2*k <= n) {

            int j = 2*k;
            if (j < n && less(j, j+1)) j++;
            if (!less(k,j)) break;
            exch(k,j);
            k = j;
        }

    }




    private boolean less(int a, int b) {
        Key aObject = pq[a];
        Key bObject = pq[b];

        return aObject.compareTo(bObject) < 0;
    }

    private void exch(int a, int b){

        Key cached = pq[a];
        pq[a] = pq[b];
        pq[b] = cached;

    }

    @Override
    public Iterator<Key> iterator() {
        return new Iterator<Key>() {
            int curPointer = 1;

            @Override
            public boolean hasNext() {
                return curPointer <= n;
            }



            @Override
            public Key next() {
                return pq[curPointer++];
            }
        };
    }
}
