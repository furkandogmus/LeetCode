class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n ==1){
            return 0;
        }
        int[] minPaths = new int[n];
        Arrays.fill(minPaths,10000);
        minPaths[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]+i>=n-1){minPaths[i] = 1;}
            else{
                int min = Integer.MAX_VALUE;
                for(int x=i;x<=nums[i]+i;x++){
           
                    min = Math.min(min,minPaths[x]+1);
                }
                minPaths[i] = min;
            }
        }

        return minPaths[0];
    }

}