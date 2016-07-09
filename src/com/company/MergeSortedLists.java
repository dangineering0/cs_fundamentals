package com.company;

public class MergeSortedLists {

    public static void main(String[] args) {
	// write your code here

        // multiple assignments work in java
        int a, b, c =0;

        int[] nums1 = new int[5];
        nums1[0] = 5;
        nums1[1] = 6;


        int[] nums2 = new int[3];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;

        merge(nums1, 2, nums2, 3);
    }


    // nums1 = [5,6, , ,]
    // nums2 = [1,2,3]

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // handle edge cases
        m--;
        n--;

        int i = 1;

        while(m>=0 || n>=0) {
            int curN1 = nums1.length - i;

            int a, b = 0;

            if (m >= 0 && n >= 0){

                a = nums1[m];
                b = nums2[n];

                if (a > b) {
                    nums1[curN1] = a;
                    m--;
                } else {
                    nums1[curN1] = b;
                    n--;
                }
            } else if (m >= 0) {
                nums1[curN1] = nums1[m];
                m--;
            } else {
                nums1[curN1] = nums2[n];
                n--;
            }
            i++;
        }


        validate(nums1);

    }


    private static void validate(int[] nums) {
        for (Integer a : nums) {
            System.out.println(a);
        }
    }
}
