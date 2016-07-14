package com.company.algo;

import com.company.SpiralMatrix;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Created by dangineering on 7/11/16.
 */
public class SpiralMatrixTest {
    public static void main(String[] args) {

        int[][] table = new int[3][3];




        int[] row1 = new int[]{0};
        int[] row2 = new int[]{3};
        int[] row3 = new int[]{6};

        table[0] = row1;
        table[1] = row2;
        table[2] = row3;


        SpiralMatrix s = new SpiralMatrix();
        System.out.println(s.spiralOrder(table));
    }
}
