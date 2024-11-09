class Solution {
    public int arrangeCoins(int n) {
        // int row =1 ;
        // int ele = n;
        // while (ele >=0){
        //     if(ele < row){ 
        //         return row-1;
        //     }
        //     ele = ele - row; 
        //     row = row +1; 
        // }
        // return -1;
         
        long l=1;
        long r=n;
        long mid=0;
        long ans=0;

        
        while(l<=r){
            mid=l+(r-l)/2;
            
            long no_of_coins=mid*(mid+1)/2;
            
            if(no_of_coins<=n){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return (int)ans;

    }
}