class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int actual = image[sr][sc];
        if (actual != color) {
            backtrack(image, sr, sc, color, actual);
        }
        return image;
    }

    public void backtrack(int[][] image, int sr, int sc, int color, int actual) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != actual) {
            return;
        }
        image[sr][sc] = color;
        backtrack(image, sr + 1, sc, color, actual);
        backtrack(image, sr, sc + 1, color, actual);
        backtrack(image, sr - 1, sc, color, actual);
        backtrack(image, sr, sc - 1, color, actual);
    }
}
