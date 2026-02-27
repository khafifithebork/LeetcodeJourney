class Solution {
    public int[] replaceElements(int[] arr) {
        int max=0;
        int[] res = new int[arr.length];
        res[arr.length-1]=-1;
        for(int i=arr.length-1;i>=1;i--){    
            max = Math.max(arr[i], max);
            res[i-1]=max;
        }
        return res;
    }
}
