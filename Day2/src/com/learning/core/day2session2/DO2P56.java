package com.learning.core.day2session2;

public class DO2P56 {
	    public static int longestPrefixSuffix(String s) {
	        int n = s.length();
	        int[] lps = new int[n];
	        lps[0] = 0;
	        int len = 0;
	        int i = 1;
	        
	        while (i < n) {
	            if (s.charAt(i) == s.charAt(len)) {
	                len++;
	                lps[i] = len;
	                i++;
	            } else {
	                if (len != 0) {
	                    len = lps[len - 1];
	                } else {
	                    lps[i] = 0;
	                    i++;
	                }
	            }
	        }
	        
	        return lps[n - 1];
	    }
	 
	    public static void main(String[] args) {
	        String s1 = "aabcdaabc";
	        String s2 = "abcab";
	        
	        System.out.println("Output for " + s1 + ": " + longestPrefixSuffix(s1));
	        System.out.println("Output for " + s2 + ": " + longestPrefixSuffix(s2));
	    }
	}



