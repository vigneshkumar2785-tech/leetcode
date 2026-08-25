class Solution {
    public int maximumCount(int[] nums) {
        int n =nums.length;
        int left =0;
        int right = nums.length-1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(nums[mid]>0)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        int positive = n - left;
        
        left = 0;
        right = n - 1;
        while(left <= right)
         {
            int mid = (left + right)/2;
            if(nums[mid]>=0)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        int neg = left;
        return Math.max(positive,neg);
    }
}