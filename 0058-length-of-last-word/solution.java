class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==' ' && j==0){
                continue;
            }
            else if(arr[i]!=' '){
                j++;
            }
            else if(arr[i]==' ' && j!=0){
                break;
            }
        }
        return j;
    }
}
