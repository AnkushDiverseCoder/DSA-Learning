class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        LinkedList<Boolean> ans= new LinkedList<Boolean>();

        for(int i =0; i<candies.length;i++){
            int max = candies[i]+extraCandies;
            int flag =0;
            for(int j=0; j<candies.length; j++){
                if(max >= candies[j]){
                    continue;
                }else{
                    flag = 1;
                }
            }
            if(flag == 0){
            ans.add(true);
        }else{
                ans.add(false);
            
            }
        }

        return ans;
    }
}