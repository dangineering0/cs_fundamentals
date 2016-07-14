package com.company.algo;

import java.util.ArrayList;

/**
 * Created by dangineering on 7/11/16.
 */
public class TreeTraverse {

    static class Node {
        int val;
        Node left;
        Node right;
        int level;

        Node(int val) {this.val =val;}
    }

    // pre order means it will pre visit the root before the children

    public void preOrder(Node node){
        if (node == null) {
            System.out.println(node);
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public String levelOrder(Node node) {
        String res = "";
        ArrayList<Node> queue = new ArrayList<>();
        node.level = 0;
        queue.add(node);

        int curLevel = 0;

        while(!queue.isEmpty()) {


            Node curNode = queue.remove(0);
            if (curNode == null) {
                // res += " null node ";
                continue;
            }

            if (curNode.level != curLevel) {
                res += " ===END OF LINE===";
                curLevel++;
            }

            res += curNode.val;


            if (curNode.left != null) curNode.left.level = curNode.level+1;
            queue.add(curNode.left);

            if (curNode.right != null) curNode.right.level = curNode.level +1;
            queue.add(curNode.right);

        }
        return res;
    }
}
