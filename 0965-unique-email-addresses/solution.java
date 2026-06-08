class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String s : emails){
            String parts[] = s.split("@");
            String local = parts[0];
            String domain = parts[1];
                StringBuilder mail = new StringBuilder();
            for(char c : local.toCharArray()){
                if(c == '.') continue;
                else if(c =='+') break;
                else mail.append(c);
            }
            set.add(mail + "@" + domain);
        }
        return set.size();
    }
}
