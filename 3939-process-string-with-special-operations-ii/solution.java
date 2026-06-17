class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        if (n == 0) return '.';
        
        long[] lengths = new long[n];
        long maxLen = (long)1e15 + 1;
        long len = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '#') {
                len *= 2;
            } else if (c == '*') {
                if (len > 0) len--;
            } else if (c == '%') {
            } else {
                len++;
            }
            
            if (len > maxLen) len = maxLen;
            lengths[i] = len;
        }

        if (k >= lengths[n - 1]) return '.';

        long currK = k;
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            long prevLen = (i == 0) ? 0 : lengths[i - 1];

            if (c >= 'a' && c <= 'z') {
                if (currK == prevLen) {
                    return c;
                }
            } else if (c == '#') {
                if (currK >= prevLen) {
                    currK %= prevLen;
                }
            } else if (c == '*') {
                    continue;
            } else if (c == '%') {
                currK = prevLen - 1 - currK;
            }
        }
        
        return '.';
    }
}
