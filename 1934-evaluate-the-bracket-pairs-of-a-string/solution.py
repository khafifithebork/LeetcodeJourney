class Solution:
    def evaluate(self, s: str, knowledge: list[list[str]]) -> str:
        mapp = {
            k : v for k, v in knowledge
        }
        res = ""
        i= 0
        while i < len(s) :
            if s[i] == '(' :
                temp = ""
                j = i + 1
                while s[j] != ')' :
                    temp += s[j]

                    j+=1

                i = j+1
                res += mapp[temp] if temp in mapp else "?"
            else :
                res += s[i]
                i += 1
        return res


                
