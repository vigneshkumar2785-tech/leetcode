import java.util.*;

class Solution {
    // 1. Changed method signature to match what LeetCode expects
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        // 2. We need to generate up to rowIndex + 1 rows
        int numRows = rowIndex + 1;
        if (numRows <= 0) {
            return new ArrayList<>(); 
        }
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevrow = triangle.get(i - 1);
                    int sum = prevrow.get(j - 1) + prevrow.get(j);
                    row.add(sum);
                }
            }
            triangle.add(row); // Make sure this line is included to save the row!
        }
        
        // 3. Return only the specific row requested
        return triangle.get(rowIndex);
    }
}