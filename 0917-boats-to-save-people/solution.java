class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0,r=people.length-1;
        int c = 0;
        while(l<r){
            if(people[r]+people[l] <= limit){
                c++;
                r--;
                l++;
            }
            else if(people[r]+people[l] > limit){
                c++;
                r--;
            }

        }
        if(r==l) c++;
        return c;
    }
}
