class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] ans = new int[nums1.length + nums2.length][2];
        int i=0, j=0, k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                ans[k][0]=nums1[i][0];
                ans[k][1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
                k++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans[k][0]=nums1[i][0];
                ans[k][1]=nums1[i][1];
                i++;
                k++;
            }
            else if(nums1[i][0]>nums2[j][0]){
                ans[k][0]=nums2[j][0];
                ans[k][1]=nums2[j][1];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
                ans[k][0]=nums1[i][0];
                ans[k][1]=nums1[i][1];
                i++;
                k++;
        }
        while(j<nums2.length){
                ans[k][0]=nums2[j][0];
                ans[k][1]=nums2[j][1];
                j++;
                k++;
        }
        return Arrays.copyOf(ans, k);
    }
}
