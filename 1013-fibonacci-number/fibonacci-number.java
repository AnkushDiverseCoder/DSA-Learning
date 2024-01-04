class Solution {
    public int fib(int n) {
       if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int prevprev = 0;
        int prev=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=prev+prevprev;
            prevprev=prev;
            prev=sum;
        }
        return sum;
    }
}