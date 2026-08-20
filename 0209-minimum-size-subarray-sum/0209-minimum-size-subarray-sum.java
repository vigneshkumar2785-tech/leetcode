class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      //Two Pointer + Sliding Window
      int min =Integer.MAX_VALUE;
      int cursum = 0;
      int high = 0;
      int low =0;
      while(high < nums.length)
      {
        cursum+=nums[high];
        high++;
        while(cursum >= target)
        {
           int curwin = high - low;
           min = Math.min(min,curwin);
           cursum-=nums[low];
           low++;
        }
      }
      return min == Integer.MAX_VALUE ? 0:min;
    }
}