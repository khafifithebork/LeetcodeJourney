class Solution {
        HashMap<Integer, Integer> memo = new HashMap<>();
        public int climbStairs(int n) {
            return ways(n);
        }
        private int ways(int n) {
            if (n == 0) return 1;
            if (n == 1) return 1;
            if (memo.containsKey(n)) return memo.get(n);
            int result = ways(n-1) + ways(n-2);
            memo.put(n, result);
            return result;
        }
}
