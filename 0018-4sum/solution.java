class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int a=0;a<nums.length;a++){
            for(int b = a+1;b<nums.length;b++){
                int c = b+1;
                int d = nums.length-1;
                if(a>0 && nums[a]==nums[a-1]){
                    continue;
                }
                if(b>a+1 && nums[b]==nums[b-1]){
                    continue;
                }
                while(c<d){
                    long sum = (long)nums[a]+nums[b]+nums[c]+nums[d];
                    if(sum < (long)target){
                        c++;
                    }
                    else if(sum>(long)target){
                        d--;
                    }
                    else if(sum==(long)target){
                        ans.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        d--;
                        while (c < d && nums[c] == nums[c-1]) c++;
                        while (c < d && nums[d] == nums[d+1]) d--;
                    }
                }
            }
        }
        return ans;
    }
}
