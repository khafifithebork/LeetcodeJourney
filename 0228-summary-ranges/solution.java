class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> emptystr = new ArrayList<>();
        List<String> list = new ArrayList<>();
        if(nums.length==0){
            return emptystr ;
        }
        
        int start = nums[0];

        for(int i = 0; i<nums.length; i++){
                if(i==nums.length-1 || nums[i+1] != nums[i]+1){
                    if(start == nums[i]){
                        list.add(Integer.toString(start));
                    }
                    else{
                        list.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));
                    }
                    if (i < nums.length - 1){ start = nums[i + 1];}
                }
        }
        return list;
    }
}
