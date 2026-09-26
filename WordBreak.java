/* 
Given a string s and a dictionary of strings wordDict, 
return true if s can be segmented into a 
space-separated sequence of one or more dictionary words.

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".

Example 2:
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".

*/ 

import java.util.*;
class Solution {
	public boolean wordBreak(String s , List<String>wordDict){
		boolean [] dp = new boolean[s.length()+1];
		dp[0] = true ;
		
		for(int i = 1 ; i<= s.length() ; i++){
			for(String word : wordDict){
				int len = word.length();
				
				if(i >= len && dp[i-len]&& s.substring(i-len, i).equals(word)){
					dp[i] = true ;
					break ;
				}
			}
		}
		return dp[s.length()];
	}
}