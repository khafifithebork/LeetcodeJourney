class Solution:
    def frequencySort(self, s: str) -> str:
        return "".join(char * count for char, count in Counter(s).most_common())
        
