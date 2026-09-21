class Solution{
	public int firstUnique(String s){
		int [] count = new int[26];
		// Step 1:-> Count frequency
		for(int i = 0 ; i<s.length(); i++){
			count[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0 ; i<s.length() ; i++){
			if(count[s.charAt(i) - 'a'] == 1){
				return i;
			}
		}
		return -1;
	}
}