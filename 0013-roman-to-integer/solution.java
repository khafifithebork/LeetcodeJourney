class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int sum=0;
        int i=0;
        for(i=0;i<s.length()-1;i++){
            if(map.get(String.valueOf(s.charAt(i)))>=map.get(String.valueOf(s.charAt(i+1)))){
                sum += map.get(String.valueOf(s.charAt(i)));
            }
            else if(map.get(String.valueOf(s.charAt(i)))<map.get(String.valueOf(s.charAt(i+1)))){
                int c = map.get(String.valueOf(s.charAt(i+1)))-map.get(String.valueOf(s.charAt(i)));
                sum = sum + c;
                i++;
            }
        }
        if(i<s.length()){
            sum += map.get(String.valueOf(s.charAt(s.length()-1)));
        }
        return sum;
    }
}
