class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastOccu = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            lastOccu.put(s.charAt(i), i);
        }

        List<Integer> partitionSizes = new ArrayList<>();
        int partiStart = 0, partiEnd = 0;
        for(int i = 0; i < s.length(); i++){
            partiEnd = Math.max(partiEnd, lastOccu.get(s.charAt(i)));
            if(i == partiEnd){
                partitionSizes.add(partiEnd - partiStart +1);
                partiStart = i+1;
            }
        }
        return partitionSizes;
    }
}
