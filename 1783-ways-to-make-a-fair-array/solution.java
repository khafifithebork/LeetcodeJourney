class Solution {
    public int waysToMakeFair(int[] nums) {
        int count =0;
        
        int[] oddSum = new int[nums.length];
        int[] evenSum = new int[nums.length];
        
        oddSum[0] = 0;
        evenSum[0] = nums[0];
        
        int totOdd = 0, totEven = 0;
        
        for(int j = 0;j<nums.length;j++){
            if(j%2==0) totEven += nums[j];
            else totOdd += nums[j];
        }
        
        for(int i=1;i<nums.length;i++){
            evenSum[i]=evenSum[i-1];
            oddSum[i]=oddSum[i-1];
            if(i%2==0){
                evenSum[i] += nums[i];
            }
            else oddSum[i] += nums[i];
        }
        
        for(int i = 0; i< nums.length;i++){
            int leftEven = (i > 0) ? evenSum[i-1] : 0;
            int leftOdd  = (i > 0) ? oddSum[i-1] : 0;

            int rightEven = totEven - evenSum[i];
            int rightOdd  = totOdd  - oddSum[i];

            if (leftEven + rightOdd == leftOdd + rightEven) {
                count++;
            }
        }
        
        return count;
    }
}
