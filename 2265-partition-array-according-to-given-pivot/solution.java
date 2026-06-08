class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> arrGreater = new ArrayList<>();
        List<Integer> arrSmaller = new ArrayList<>();
        List<Integer> arrEquals = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == pivot) arrEquals.add(nums[i]);
            else if(nums[i] > pivot) arrGreater.add(nums[i]);
            else arrSmaller.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        List<Integer> merged = new ArrayList<>();
        merged.addAll(arrSmaller);
        merged.addAll(arrEquals);
        merged.addAll(arrGreater);
        for(int i=0;i<nums.length;i++){
            ans[i] = merged.get(i);
        }
        return ans;
    }
}
