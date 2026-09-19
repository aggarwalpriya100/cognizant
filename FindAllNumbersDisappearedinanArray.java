class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        // Step 1 :-> mark every number that exists 
        for(int i = 0 ; i<nums.length ; i++){
                                            // Get original number 
            int index = Math.abs(nums[i]) - 1 ;
                                            // Move the number as present 
            if(nums[index] > 0 ){
                nums[index] = -nums[index];
            }                                
        }

        // Step 2 :-> Find positive positions 
        for(int i =0  ; i<nums.length ; i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans ;
    }
}