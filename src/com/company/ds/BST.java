package com.company.ds;

/**
 * Created by dangineering on 7/10/16.
 */
public class BST<Key extends Comparable<Key>, Value> {
    Key key;
    Value value;

    BST left, right;


    public BST(Key key, Value value) {
        this.key  = key;
        this.value = value;
    }

    public Value get(Key key) {
        BST found = this;
        while (found != null) {

            int comp = key.compareTo((Key) found.key);

            // current key is less than root's so move right
            if (comp < 0) {
                found = found.left;
            } else if (comp > 0) {
                found = found.right;
            } else {
                return (Value)found.value;
            }
        }
        // could not find
        return null;
    }
}
