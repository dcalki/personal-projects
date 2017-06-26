package com.dynabeast.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbersToInteger {
    private static int romanToInt(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        
        if(s == null || s.trim().equals("")) {
            throw new IllegalArgumentException("Provided string is null or empty.");
        }
        int result = 0;
        int i = 0;
        while(i < s.length()) {
            int currNum = romanToIntMap.get(s.charAt(i)).intValue();
            if(i <= (s.length() - 2)) {
                int nextNum = romanToIntMap.get(s.charAt(i + 1)).intValue();
                if(nextNum > currNum) {
                    result += (nextNum - currNum);
                    i += 2;
                    continue;
                } else {
                    result += currNum;
                }
            } else {
                result += currNum;
            }
            i++;
        }
        return result;
    }
    
    public static void main(String[] args) {
		String s = "CXIX";
		System.out.println(romanToInt(s));
	}
}
