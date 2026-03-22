package org.example;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            // If number already exists, duplicate found
            if (set.contains(num)) {
                return true;
            }

            // Otherwise add number to set
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,1};

        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}
