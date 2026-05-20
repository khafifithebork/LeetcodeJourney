class Solution {
    public int nextGreaterElement(int n) {
        //init
        char[] digits = String.valueOf(n).toCharArray();
        int i = digits.length-2;
        //pivot
        while(i>=0 && digits[i] >= digits[i+1]){
            i--;
        }
        if(i<0) return -1;
        //successor
        int j = digits.length-1;
        while(digits[j] <= digits[i]){
            j--;
        }
        //swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        //reverse
        reverse(digits, i+1, digits.length-1);

        String number = new String(digits);
        long val = Long.parseLong(String.valueOf(number));
        return (val > Integer.MAX_VALUE) ? -1 : (int)val;

    }

    public void reverse(char[] arr, int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
