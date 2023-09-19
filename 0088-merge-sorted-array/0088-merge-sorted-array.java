class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1,j=n-1;
        while(i>=0 || j>=0){
            if(j<0){
                nums1[i] = nums1[i--];
                continue;
            }
           if(i<0){
                nums1[j] = nums2[j--];
                continue;
            }
            if(nums1[i]>=nums2[j]){
                nums1[i+j+1] = nums1[i--];
            }else{
                nums1[i+j+1] = nums2[j--];
            }
        }


    }
}