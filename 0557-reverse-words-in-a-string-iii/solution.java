class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s);
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                reverse(str, j, i - 1);
                j = i + 1;
            }
        }
        
        reverse(str, j, str.length() - 1);
        return str.toString();
    }

    public void reverse(StringBuilder s, int start, int end) {
        while (start < end) {
            char temp = s.charAt(start);
            s.setCharAt(start, s.charAt(end));
            s.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
