package com.company.algo;

/**
 * Created by dangineering on 7/11/16.
 */
public class TreeOrderTest {

    static class Node {
        int val;
        TreeTraverse.Node left;
        TreeTraverse.Node right;

        Node(int val) {this.val =val;}
    }

    public static void main(String...args){
        TreeTraverse p = new TreeTraverse();

        TreeTraverse.Node a = new TreeTraverse.Node(1);
        TreeTraverse.Node b = new TreeTraverse.Node(2);
        TreeTraverse.Node c = new TreeTraverse.Node(3);

        TreeTraverse.Node d = new TreeTraverse.Node(4);
        TreeTraverse.Node e = new TreeTraverse.Node(5);


        a.left = b;
        a.right = c;


        c.left = d;
        c.right = e;


//        p.preOrder(a);

        String s = p.levelOrder(a);

        System.out.println(s);
    }


}
