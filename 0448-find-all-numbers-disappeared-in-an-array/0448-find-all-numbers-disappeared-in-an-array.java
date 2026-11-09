class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int num = 1;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i< n;i++)
        {
    if(nums[i]==num)
    {
        num++;
    }
    else if(nums[i]>num)
    {
        ans.add(num);
        i--;
        num++;
    }
        }
        while(num<=n)
        {
            ans.add(num);
            num++;
        }
        return ans;
    }
}