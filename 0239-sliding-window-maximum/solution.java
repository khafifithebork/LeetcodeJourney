class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k<=0) return new int[0];
        Deque<Integer> dq = new LinkedList<>();
        int index = 0;
        int[] res = new int[nums.length-k+1];
        for(int i =0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                res[index++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
