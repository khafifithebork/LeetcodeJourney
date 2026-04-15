class TimeMap {

    class Data{
        String val;
        int time;
        Data(String val, int time){
            this.val = val;
            this.time = time;
        }
    }
    Map<String, List<Data>> map = new HashMap<>();
    public TimeMap() {
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<Data>()).add(new Data(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        return binarySearch(map.get(key), timestamp);
    }
    public String binarySearch(List<Data> list, int time){
        int left = 0, right = list.size()-1;
        while(left < right){
            int mid = (left + right +1)/2;
            if(time < list.get(mid).time) right = mid - 1;
            else left = mid;
        } 
        return list.get(left).time <= time ? list.get(left).val : "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
