class Solution {
    public int compress(char[] chars) {
        int j=0;
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
            if(chars[i]!=chars[i-1]){
                chars[j]=chars[i-1];
                j++;
                if(count>1){
                    String countStr = String.valueOf(count);
                    for (int k = 0; k < countStr.length(); k++) {
                        chars[j++] = countStr.charAt(k);
                    }
                }
                count=1;
            }
        }
        chars[j] = chars[chars.length - 1];
        j++;
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (int k = 0; k < countStr.length(); k++) {
                chars[j++] = countStr.charAt(k);
            }
        }
        return j;
    }
}
