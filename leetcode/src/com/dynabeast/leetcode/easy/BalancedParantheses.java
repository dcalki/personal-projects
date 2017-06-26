package com.dynabeast.leetcode.easy;

import java.util.Stack;

public class BalancedParantheses {
    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(isOpeningBracket(c)) {
        		stack.push(c);
        	} else if(isClosingBracket(c)) {
        		if(stack.isEmpty()) {
        			return false;
        		}
        		if(c == ')' && stack.pop() != '(') {
        			return false;
        		} else if(c == '}' && stack.pop() != '{') {
        			return false;
        		} else if(c == ']' && stack.pop() != '[') {
        			return false;
        		}
        	}
        }
        return stack.isEmpty();
    }
    
    private static boolean isOpeningBracket(char c) {
    	if(c == '(' || c == '{' || c == '[') {
    		return true;
    	}
    	return false;
    }
    
    private static boolean isClosingBracket(char c) {
    	if(c == ')' || c == '}' || c == ']') {
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		String s = "{[]}";
		System.out.println(isValid(s));
	}
}
