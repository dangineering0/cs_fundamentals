package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.or;

/**
 * Created by dangineering on 7/11/16.
 */
public class SpiralMatrix {
    List<Integer> ans;
    int[][] matrix;

    public List<Integer> spiralOrder(int[][] matrix) {

        ans = new ArrayList<>();
        this.matrix = matrix;
        if (matrix.length == 0) return ans;
        spiralOrderHelper(0, matrix[0].length-1, 0, matrix.length-1);
        return ans;
    }

    private void spiralOrderHelper(int startX, int endX, int startY, int endY) {


        if (endX < startX || endY < startY) {
            return;
        }


        // read right to left x
        for (int i = startX; i<=endX; i++) {

            ans.add(matrix[startY][i]);
        }

        // right x to bottom
        for (int i = startY+1; i<= endY; i++) {

            ans.add(matrix[i][endX]);
        }


        // read across bottom
        for (int i = endX-1; i>=startX; i--) {
            if (endY != startY) {
                ans.add(matrix[endY][i]);
            }
        }


        // left x bottom to up
        for (int i = endY-1; i> startY; i--) {
            if (endX != startX) {
                ans.add(matrix[i][startX]);
            }

        }

        spiralOrderHelper(startX+1, endX-1, startY+1, endY-1);

    }


}
