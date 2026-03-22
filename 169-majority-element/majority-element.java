class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        for(int i=0 ; i<nums.length ;i++)
        {
            if(count == 0)
            {
                cand = nums[i]; // next Canditate Become Majority element 
            }
            if(cand == nums[i])
            {
                count ++;  //Meet same person increase a count
            }
            else
            {
                count --;
            }
        }
        return cand;
        
    }
}