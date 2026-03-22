package org.example;

import java.util.*;

public class TwoSumExample  {
    public static int[] twoSum(int[] nums, int target) {

        // HashMap to store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i]; // number needed to reach target

            // Check if complement already exists in map
            if (map.containsKey(complement)) {
                // Return indices of the two numbers
                return new int[]{map.get(complement), i};
            }

            // Store current number and index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
