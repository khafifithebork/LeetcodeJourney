class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] arrTyped = typed.toCharArray();
        char[] arrName = name.toCharArray();
        int i = 0, j = 0;
        while(j < arrTyped.length){
            if(i < arrName.length && arrTyped[j] == arrName[i]){
                i+=1;
                j+=1;
            }
            else if(j > 0 && arrTyped[j] == arrTyped[j-1]) j++;
            else return false;
        }
        return i == name.length();
    }
}
