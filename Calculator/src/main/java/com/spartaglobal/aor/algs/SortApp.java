package com.spartaglobal.aor.calculator.algs;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        int[] nums = {6, 2, 4, 1, 3, 5};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(nums);
        System.out.printf("Comparisons: %d Swaps: %d\n", sorter.getNumComps(), sorter.getNumSwaps());
        System.out.println(Arrays.toString(nums));
    }
}
