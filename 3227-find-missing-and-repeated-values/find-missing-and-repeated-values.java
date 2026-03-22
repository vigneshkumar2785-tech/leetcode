import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        HashSet<Integer> seen = new HashSet<>();
        int repeated = -1;
        long actualSum = 0;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
             {
                int val = grid[i][j];
                if (seen.contains(val)) 
                {
                    repeated = val;
                }
                seen.add(val);
                actualSum += val;
            }
        }

        long expectedSum = (long) size * (size + 1) / 2;
        int missing = (int) (expectedSum - (actualSum - repeated));

        return new int[]{repeated, missing};
    }
}
