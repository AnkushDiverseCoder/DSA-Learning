class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       if(flowerbed.length == 1){
           if(flowerbed[0] == 0){
               if(n<=1){
                   return true;
               }else{
                   return false;
               }
           }
           if(flowerbed[0] == 1){
               if(n==0){
                   return true;
               }else{
                   return false;
               }
           }
       }

        int count = 0;
        for(int i =0; i< flowerbed.length; i++){
            if(i == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0){
                count++;
                flowerbed[i]=1;
            }else if(i == flowerbed.length-1 && flowerbed[i-1] == 0 && flowerbed[i] == 0){
                count++;
                flowerbed[i]=1;
            }else  if( i!=0 && i != flowerbed.length-1 && flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1]==0){
                count++;
                flowerbed[i]=1;
            }
        }
        return count>=n;

    }
}