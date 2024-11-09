class Solution {
    public int arrangeCoins(int n) {
        int row =1 ;
        int ele = n;
        while (ele >=0){
            if(ele < row){ 
                return row-1;
            }
            ele = ele - row; 
            row = row +1; 
        }
        return -1;
    }
}