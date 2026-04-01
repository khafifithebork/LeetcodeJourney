class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<asteroids.length;i++){
            boolean alive = true;
            while(!stack.isEmpty() && stack.peek() > 0 && asteroids[i]<0){
                if(Math.abs(stack.peek()) < Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(Math.abs(stack.peek()) > Math.abs(asteroids[i])){
                    alive = false;
                    break;
                }
                else if(Math.abs(stack.peek()) == Math.abs(asteroids[i])){
                    alive = false;
                    stack.pop();
                    break;
                }
            }
            if(alive == true) stack.push(asteroids[i]);
        }
        int[] res = new int[stack.size()];
        int j=0;
        for(int s : stack){
            res[j] = s;
            j++;
        }
        return res;
    }
}
