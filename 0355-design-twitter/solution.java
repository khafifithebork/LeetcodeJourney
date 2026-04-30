class Twitter {
    HashMap<Integer, HashSet<Integer>> following;
    HashMap<Integer, List<int[]>> post;
    int time;

    public Twitter() {
        following = new HashMap<>();
        post = new HashMap<>();
        time = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        time++;
        List<int[]> p = post.getOrDefault(userId, new ArrayList<>());
        p.add(0, new int[]{tweetId, time});
        post.put(userId, p);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        HashSet<Integer> followingList = following.getOrDefault(userId, new HashSet<>());
        followingList.add(userId);
        for(int id : followingList){
            List<int[]> tweets = post.getOrDefault(id, new ArrayList<>());
            for(int i =0; i< Math.min(tweets.size(), 10); i++){
                maxHeap.offer(tweets.get(i));
                if(maxHeap.size()>10) maxHeap.poll();
            }
        }
        while(!maxHeap.isEmpty()){
            int[] curr = maxHeap.poll();
            list.add(0, curr[0]);
        }
        return list;
    }
    
    public void follow(int followerId, int followeeId) {
        HashSet<Integer> set = following.getOrDefault(followerId, new HashSet<>());
        set.add(followeeId);
        following.put(followerId, set);
    }
    
    public void unfollow(int followerId, int followeeId) {
        HashSet<Integer> set = following.getOrDefault(followerId, new HashSet<>());
        if(set.contains(followeeId)){
            set.remove(followeeId);
            following.put(followerId, set);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
