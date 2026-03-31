class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = prices.clone();
        for(int i = 0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                answer[stack.pop()]-= prices[i];
            }
            stack.push(i);
        }
        return answer;
    }
}
