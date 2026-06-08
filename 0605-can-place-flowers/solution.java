class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if((i == 0 || arr[i-1] == 0) && 
                    (i == arr.length-1 || arr[i+1] == 0)){
                        n--;
                        arr[i]=1;
                }
            }
            else continue;
        }
        return n<=0;
    }
}
