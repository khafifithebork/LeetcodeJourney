class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length, m=matrix.length;
        int start = 0, end = n*m-1;
        if(m==0) return false;
        while(start <= end){
            int mid = (start+end)/2;
            if(matrix[mid/n][mid%n] == target) return true;
            else if(matrix[mid/n][mid%n] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;

    }
}
