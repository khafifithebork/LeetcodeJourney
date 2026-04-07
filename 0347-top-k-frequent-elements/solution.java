class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //Bucket using map
        HashMap<Integer,List<Integer>> bucket = new HashMap<>();
        for(Integer num : map.keySet()){
            Integer freq = map.get(num);
            if(!bucket.containsKey(freq)){
                bucket.put(freq, new ArrayList<>());
            }
            bucket.get(freq).add(num);
        }

        //retriev the top k elements
        int[] res = new int[k];
        for(int i=nums.length;i>0;i--){
            if(bucket.containsKey(i)){
                List<Integer> list = bucket.get(i);
                for(Integer integer : list){
                    res[--k] = integer;
                    if(k==0) return res;
                }
            }
        }
        return res;
    }
}
