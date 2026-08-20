class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minsum = Integer.MAX_VALUE;
        boolean found = false;
        for(int k=l;k<=r;k++)
        {
            int sum = 0;
            for(int i=0;i<k;i++)
            {
                sum += nums.get(i);
            }
            if(sum>0)
            {
                minsum = Math.min(minsum,sum);
                found =true;
            }
              for (int i = k; i < n; i++) {
                sum += nums.get(i) - nums.get(i - k);
                
                if (sum > 0) {
                    minsum = Math.min(minsum, sum);
                    found = true;
        }
    }

    
}
if (found) {
    return minsum;
} else {
    return -1;
}

    }
}
