class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left=0;
        int right=skill.length-1;
        int sum = skill[left]+skill[right];
        long chemistry=0;
        while(left<right){
            if(sum==skill[left]+skill[right]){
                chemistry = chemistry + (long)(skill[left]*skill[right]);
                left++;
                right--;
            }
            else if(sum!=skill[left]+skill[right]){
                return -1;
            }
        }
        return chemistry;
    }
}
