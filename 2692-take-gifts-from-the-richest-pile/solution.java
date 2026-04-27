class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts){
            maxHeap.offer(gift);
        }
        long sum = 0;
        while(k>0){
            maxHeap.offer((int)Math.sqrt(maxHeap.poll()));
            k--;
        }
        while(maxHeap.size()>0){
            sum+=maxHeap.poll();
        }
        return sum;
    }
}
