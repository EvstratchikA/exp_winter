package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 11, 6, 18, 3};
        boolean isSorted = false;
        int temp;

        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
