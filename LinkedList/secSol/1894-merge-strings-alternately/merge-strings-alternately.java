class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i =0 ;
        int j =0 ;
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder();
        while( i < word1.length() || j < word2.length() ){
             if (i < m) {
                sb.append(word1.charAt(i));
                i++;
            }
            if (j < n) {
                sb.append(word2.charAt(j));
                j++;
            }  
        }
        
        return sb.toString();
    }
}