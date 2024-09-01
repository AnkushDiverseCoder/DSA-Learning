class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];

        for(int i = 0; i<s.length();i++) {
            
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            int index1 = (c1+0)%97;
            int index2 = (c2+0)%97;

            arr[index1]+= 1;
            arr[index2]-= 1;
        }

        for(int i:arr){
            if(i!=0){
                return false;
            }
        } 

        return true;
    }
}