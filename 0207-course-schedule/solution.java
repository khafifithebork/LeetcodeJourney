class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            int a = pre[0];
            int b = pre[1];
            adj.get(b).add(a);
        }
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (!dfs(i, adj, visited)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited){
        visited[node]=1;
        for(int neighbor : adj.get(node)){
            if(visited[neighbor] == 1) return false;
            else if(visited[neighbor] == 0){
                if(!dfs(neighbor, adj, visited)) return false;
            }
        }
        visited[node] = 2;
        return true;
    }
}
