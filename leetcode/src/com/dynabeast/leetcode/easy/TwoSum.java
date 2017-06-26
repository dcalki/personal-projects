package com.dynabeast.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            numIndexMap.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numIndexMap.get(complement) != null 
                    && numIndexMap.get(complement) != i 
                    && numIndexMap.containsKey(complement)) {
                return new int[] {i, numIndexMap.get(complement)};
            }
        }
        throw new IllegalArgumentException("No solution");
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,3,2};
    	int target = 5;
    	System.out.println(twoSum(nums, target));
    }
}
