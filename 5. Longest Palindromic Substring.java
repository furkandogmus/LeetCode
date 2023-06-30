class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
               int totalSize = nums1.length+nums2.length;
        int[] nums3 = new int[totalSize];
        int i=0,j=0;
        for(int k=0;k<totalSize;k++){
            if(j==nums2.length || (i<nums1.length && nums1[i] < nums2[j]) ){
                nums3[k] = nums1[i];
                i++;
            }
            else{
                nums3[k] = nums2[j];
                j++;
            }
        }
        if(totalSize % 2==1) return nums3[totalSize/2];
        return (double)(nums3[(totalSize-1)/2]+nums3[(totalSize+1)/2])/2;
    }
}
