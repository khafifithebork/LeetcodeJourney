class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if(color == original) return image;
        dfs(image, sr, sc, original, color);
        return image;
    }
    static void dfs(int[][] image, int i, int j, int originalColor, int newColor){
        if(i> image.length-1 || j>image[0].length-1 || i < 0 || j<0) return;
        if(image[i][j] != originalColor) return;
        image[i][j] = newColor;
        dfs(image, i+1, j, originalColor, newColor);
        dfs(image, i-1, j, originalColor, newColor);
        dfs(image, i, j+1, originalColor, newColor);
        dfs(image, i, j-1, originalColor, newColor);
    }
}
