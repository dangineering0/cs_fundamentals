//package com.company.LRU;
//
///**
// * Created by dangineering on 7/9/16.
// */
//import java.util.HashMap;
//import java.util.Iterator;
//
///** Created by dangineering
// * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
//
//
// set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
// */
//
//public class LRUCache implements Iterable {
//
//    HashMap<Integer, DoublyLinkedList> map;
//    DoublyLinkedList head;
//    DoublyLinkedList tail;
//    DDIterator ddIterator;
//    int capacity;
//
//    public LRUCache(int capacity) {
//        map = new HashMap<>();
//        this.capacity = capacity;
//        this.ddIterator = new DDIterator();
//    }
//
//    public int get(int key) {
//        if (!map.containsKey(key)) {
//            return -1;
//        } else {
//            DoublyLinkedList d = map.get(key);
//            appendToHead(d);
//            removeAt(d);
//            return d.val;
//        }
//    }
//
//    // set(key, value) - Set or insert the value if the key is not already present.
//    // When the cache reached its capacity,
//    // it should invalidate the least recently used item before inserting a new item.
//
//    public void set(int key, int value) {
//        if (map.size() == capacity) {
//            removeLeastRecentlyUsed();
//        }
//        // insert
//        // map doesn't contain key
//        if (!map.containsKey(key)) {
//            DoublyLinkedList d = new DoublyLinkedList(key, value);
//            if (head == null) {
//                head = d;
//                tail = d;
//            } else {
//                // append to head
//                appendToHead(d);
//            }
//            map.put(key, d);
//
//        } else {
//            // update value
//            DoublyLinkedList curD = map.get(key);
//            curD.val = value;
//            appendToHead(curD);
//            removeAt(curD);
//        }
//
//    }
//
//    private void appendToHead(DoublyLinkedList d) {
//        d.next = head;
//        head.prev = d;
//        head = d;
//    }
//
//    private void removeLeastRecentlyUsed() {
//        if (map.size() == 0) {
//            return;
//        }
//        map.remove(tail.key);
//        if (capacity == 1) {
//            head = null;
//            tail = null;
//        } else {
//            tail.prev.next = null;
//        }
//    }
//
//    private void removeAt(DoublyLinkedList d) {
//        if (d.prev != null) {
//            d.prev = d.next;
//        } else {
//            d.next.prev = null;
//        }
//    }
//
//    @Override
//    public DDIterator iterator() {
//        return ddIterator;
//    }
//
//
//    /**
//     * Iterator
//     */
//
//    class DDIterator implements Iterator<DoublyLinkedList>{
//
//        DoublyLinkedList curNode;
//
//        DDIterator() {
//            curNode = head;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return curNode != null;
//        }
//
//        @Override
//        public DoublyLinkedList next() {
//
//            DoublyLinkedList res = curNode;
//            curNode = curNode.next;
//            return res;
//        }
//    }
//
//    /**
//     * Doubly LL
//     */
//    static class DoublyLinkedList {
//        DoublyLinkedList prev;
//        DoublyLinkedList next;
//        int key;
//        int val;
//
//        DoublyLinkedList(int key, int val) {
//            this.key = key;
//            this.val = val;
//        }
//    }
//}