// Brute -- NOT WORKING

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//          Set<List<Integer>> res = new HashSet<>();
//          int n = nums.length;
//          for(int i = 0 ;i<n-3;i++)
//          {
//             for(int j =i+1;j<n-2;j++)
//             {
//                 for(int k=j+1;k<n-1;k++)
//                 {
//                     for(int l=k+1;l<n;l++)
//                     {
//                         long sum =(long) nums[i]+nums[j]+nums[k]+nums[l];
//                         if(sum == target)
//                         {
//                             List<Integer> ls = Arrays.asList(nums[i],
//                             nums[j],
//                             nums[k],
//                             nums[l]);
//                             Collections.sort(ls);
//                             res.add(ls);
//                         }
//                     }
//                 }
//             }
//          }

//         return new ArrayList<>(res);    }
// }

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
       for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;
             while (left < right) {
                  long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                  if (sum == target) {
                        List<Integer> ls = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        res.add(ls);

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res; 
    }
}