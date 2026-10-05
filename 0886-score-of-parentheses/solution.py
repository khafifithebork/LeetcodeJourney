class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        def is_valid_single_type(s: str) -> bool:
            balance = 0
            for char in s:
                if char == '(':
                    balance += 1
                elif char == ')':
                    balance -= 1
                
                # If balance goes negative, a closing bracket came before an opening one
                if balance < 0:
                    return False
                    
            return balance == 0

        def  f(s):
            if not s:
                return 0
            if s == "()":
                return 1
            if is_valid_single_type(s[1:-1]):
                return 2 * f(s[1:-1])
            ans = 0
            for i in range(2,len(s)):
                a = s[:i]
                b = s[i:]
                if is_valid_single_type(a) and is_valid_single_type(b):
                    ans = max(f(a) + f(b),ans)
                    
            return ans
        
        return f(s)
