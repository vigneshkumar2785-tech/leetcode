class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int ans = -1;
        int left =0;
        int right = nums.length -1;
        while(left <= right)
        {
            int mid = (left+right) /2;
            if(nums[mid]==target)
            {
                ans = mid;
                break;
            }
            else if(nums[mid] < target)
            {
                left = mid+1;
                right = right;
            }
            else
            {
                right = mid-1;
                left = left;
            }
        }
        return ans;
    }
}