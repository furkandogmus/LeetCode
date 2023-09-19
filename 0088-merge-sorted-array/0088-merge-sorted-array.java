class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        ArrayList<Integer> ar = new ArrayList<>();
        int i=0,j=0;
        while(m!=i && j!=n){
            if(nums1[i]>=nums2[j]){
                ar.add(nums2[j++]);
            }else{ar.add(nums1[i++]);}
        }
        while(m!=i){
            ar.add(nums1[i++]);
        }
        while(n!=j){
            ar.add(nums2[j++]);
        }
    
        for(i=0;i<ar.size();i++){
            nums1[i] = ar.get(i);
        }

    }
}