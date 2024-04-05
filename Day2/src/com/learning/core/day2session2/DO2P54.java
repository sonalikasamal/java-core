package com.learning.core.day2session2;

public class DO2P54 {
	    public static void main(String[] args) {
	        String input = "aebcbda";
	        int deletions = minDeletionsForPalindrome(input);
	        System.out.println("Minimum deletions to make the string palindrome: " + deletions);
	    }
	 
	    public static int minDeletionsForPalindrome(String str) {
	        int n = str.length();
	        int[][] dp = new int[n][n];
	 
	        // Initialize dp array for substrings of length 1
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = 0;
	        }
	 
	        // Fill the dp array for substrings of length greater than 1
	        for (int len = 2; len <= n; len++) {
	            for (int i = 0; i < n - len + 1; i++) {
	                int j = i + len - 1;
	                if (str.charAt(i) == str.charAt(j)) {
	                    dp[i][j] = dp[i + 1][j - 1];
	                } else {
	                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        return dp[0][n - 1];
	    }
	}


