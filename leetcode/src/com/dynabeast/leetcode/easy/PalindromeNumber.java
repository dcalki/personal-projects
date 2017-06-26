package com.dynabeast.leetcode.easy;

public class PalindromeNumber {
    private static boolean isPalindrome(int x) {
    	if(x < 0 || (x != 0 && x % 10 == 0)) {
    		return false;
    	}
    	int reverse = 0;
    	while (x > reverse) {
    		reverse = reverse * 10 + x % 10;
    		x = x / 10;
    	}
    	return x == reverse || x == reverse / 10;
    }
    
    public static void main(String[] args) {
    	int x = 5885;
    	System.out.println(isPalindrome(x));
    }
}
