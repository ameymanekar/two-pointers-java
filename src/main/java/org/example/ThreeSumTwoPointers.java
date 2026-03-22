package org.example;

import java.util.*;

public class ThreeSumTwoPointers {

    public static void main(String[] args) {

        // Example input
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Call function
        List<List<Integer>> result = threeSum(nums);

        // Print result
        System.out.println("Triplets with sum = 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    /**
     * Function to find all unique triplets such that:
     * nums[i] + nums[j] + nums[k] = 0
     *
     * Approach:
     * 1. Sort the array
     * 2. Fix one element
     * 3. Use Two Pointers for remaining part
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        // Step 1: Sort the array (required for Two Pointers)
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Fix one element (nums[i])
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicates for i (important for unique triplets)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Find pairs using Two Pointers
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Case 1: Triplet found
                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move left pointer forward
                    left++;

                    // Skip duplicate values for left pointer
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }

                // Case 2: Sum is too small → increase sum
                else if (sum < 0) {
                    left++;
                }

                // Case 3: Sum is too large → decrease sum
                else {
                    right--;
                }
            }
        }

        return result;
    }
}
