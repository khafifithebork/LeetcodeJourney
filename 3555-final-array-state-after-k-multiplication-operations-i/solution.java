class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
    if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
    return Integer.compare(a[1], b[1]);
});
        for(int i = 0; i<nums.length;i++){
            minHeap.offer(new int[]{nums[i],i});
        }
        while(k>0){
            int[] cur = minHeap.poll();
            cur[0] *= multiplier;
            minHeap.offer(cur);
            k--;
        }
        int[] ans = new int[nums.length];
        while(!minHeap.isEmpty()){
            int[] cur = minHeap.poll();
            ans[cur[1]] = cur[0];
        }
        return ans;
    }
}
