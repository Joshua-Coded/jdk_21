package part_6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // int[] a = { 1, 2, 3, 4, 5, 6 };
        // int b = a[0];
        // System.out.println(b);
        // System.out.println(a);

        // access arrays using for loops and for each iteration
        // int[] results = { 10, 49, 23, 40, 50 };
        // for (int i = 0; i < results.length; i++) {
        // System.out.println(results[i]);
        // }

        // double[] results = { 7.0, 8.0, 9.0, 5.0, 3.0, 4.0 };
        // double total = 0;
        // for (int i = 0; i < results.length; i++) {
        // total += results[i];
        // }

        // double average = total / results.length;
        // System.out.println(average);

        // int[] nums = { 23, 45, 67, 98, 454, 235, 232, 454 };

        // for (int num : nums) {
        // System.out.println(num);
        // }

        // int[][] matrixs = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.println(matrix[i][j] + "");
        // }
        // System.out.println();
        // }

        // for (int[] row : matrixs) {
        // for (int element : row) {
        // System.out.println(element + " ");
        // }
        // System.out.println();
        // }

        // int[][][][] matrixs = { { { { 1, 2, 3, 4 } } }, { { { 5, 6, 7, 8 } } }, { { {
        // 9, 10, 11, 12 } } },
        // { { { 13, 14, 15, 16 } } } };

        // for (int[][][] row : matrixs) {
        // for (int[][] elements : row) {
        // for (int[] el : elements) {
        // for (int e : el) {
        // System.out.println(e);
        // }
        // System.err.println();
        // }
        // System.out.println();
        // }
        // System.out.println();
        // }

        // using the arrays class in java
        int[] results = { 23, 24, 45, 23, 45 };
        String arraysAsString = Arrays.toString(results);
        System.out.println("Arrays.toString " + arraysAsString);
    }
}