class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // 1. Calculate the width between pointers
            int width = right - left;
            
            // 2. The water level is determined by the shorter of the two lines
            int currentHeight = Math.min(height[left], height[right]);
            
            // 3. Calculate current area and update maxArea if it's the new record
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            // 4. Optimization Move:
            // Move the pointer that points to the shorter line inward.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}