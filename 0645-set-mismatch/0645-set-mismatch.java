class Solution {
    public int[] findErrorNums(int[] nums) {
     int n = nums.length;
     int[] fre = new int[n+1];
     int dup =0;
     int mis = 0;
     for(int i=0;i<n;i++)
     {
        fre[nums[i]]++;
     }
     for(int i=1;i<=n;i++)
     {
        if(fre[i]==2)
        {
            dup =i;
        }
        if(fre[i]==0)
        {
            mis =i;
        }
     }
     return new int[]{dup,mis};
}
}