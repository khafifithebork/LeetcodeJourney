class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : nums1) 
            set.add(num);

        for(int num : nums2){
            if(set.contains(num))
                result.add(num);
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for(int n : result)
            ans[i++] = n;

        return ans;
    }
}
