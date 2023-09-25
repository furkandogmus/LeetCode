class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(flowerbed.length==1 && n==1) return flowerbed[0]==0;
        if(flowerbed[1]==0 && flowerbed[0]==0){
            n--;
            flowerbed[0] = 1;
        }
        if(flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]==0){
            n--;
            flowerbed[flowerbed.length-1] = 1;
        }
        
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                n--;
                flowerbed[i]=1;
            }
        }
        return n<=0;
    }
}