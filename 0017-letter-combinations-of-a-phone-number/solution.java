class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> res= new ArrayList<>();
        backtrack(map, digits, new StringBuilder(), 0, res);
        return res;
    }
    public void backtrack(Map<Character, String> map, String digits, StringBuilder current, int p, List<String> res)
    {
        if (p== digits.length())
        {
            res.add(current.toString());
            return;
        }

        for (int i=0;i<map.get(digits.charAt(p)).length();i++)
        {
            current.append(map.get(digits.charAt(p)).charAt(i));
            backtrack(map, digits, current, p+1, res);
            current.deleteCharAt(current.length()-1);
        }
    }
}
