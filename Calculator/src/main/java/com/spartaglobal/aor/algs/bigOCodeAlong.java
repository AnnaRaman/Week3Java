package com.spartaglobal.aor.calculator.algs;

import java.util.Random;

public class bigOCodeAlong {
    public static void main(String[] args) {
        // random doubles - Math.random() gives a double between 0 and 0.9999999
        // this example generates numbers between 100 and 499.99999
        for (int i=0; i < 20; i++){
            System.out.print(100 + Math.random() * 400 + " ");
        }
        System.out.println();

        // random int

        Random rng = new Random();
        // Roll a die
        for (int i=0; i < 20; i++){
            System.out.println(rng.nextInt(1,7) + " ");
        }
        System.out.println();

        Random fakeRandom = new Random(42);
        for(int i=0; i < 20; i++) {
            System.out.println(fakeRandom.nextInt(1, 7) + " ");
        }
        System.out.println();

        Random fakeRandom2 = new Random(42);
        for(int i=0; i < 20; i++){
            System.out.println(fakeRandom2.nextInt(1,7) + " ");
        }
    }

    // Constant time O(1)
    // same time regardless of n
    public static int getFirstElement(int[] nums){
        return nums[0];
    }

    // logarithmic 0(log n) 10^3 = 1000     log10(1000) = 3     log10(1000000) = 6  split big group in half to find magic key
    // linear O(n)
    public boolean findName(String[] name) {
        for (String s : name) {
            if (s.equals(name)) {
            }
        }
        return true;
    }

    // quadratic O(n^2) - e.g bubble sort
    public boolean findElement(int[][] matrix, int value) {
        for (int i = 0; i < 20; i++ ) {
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
}
