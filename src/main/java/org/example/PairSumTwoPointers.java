package org.example;

public class PairSumTwoPointers {

    public static void main(String[] args) {

        // Example input
        int[] nums = {-5, -2, 3, 4, 6};
        int target = 7;

        // Call the function
        int[] result = pairSum(nums, target);

        // Print result
        if (result.length == 2) {
            System.out.println("Pair found at indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found");
        }
    }

    /**
     * Function to find two indices such that nums[i] + nums[j] = target
     * Uses Two Pointer approach (only works for SORTED arrays)
     */
    public static int[] pairSum(int[] nums, int target) {

        // Initialize two pointers
        int left = 0;                  // Start from beginning
        int right = nums.length - 1;   // Start from end

        // Loop until pointers meet
        while (left < right) {

            // Calculate current sum
            int sum = nums[left] + nums[right];

            // Case 1: If sum equals target → return indices
            if (sum == target) {
                return new int[]{left, right};
            }

            // Case 2: If sum is smaller → move left pointer forward (increase sum)
            else if (sum < target) {
                left++;
            }

            // Case 3: If sum is larger → move right pointer backward (decrease sum)
            else {
                right--;
            }
        }

        // If no pair found, return empty array
        return new int[]{};
    }
}