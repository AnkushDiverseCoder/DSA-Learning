class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = ""; 
        String w2 = ""; 
        // for loop
        for(int i =0 ; i<word1.length; i++){
            // Body
            w1 += word1[i];
        }

        // while loop
        int i = 0;
        while( i <= word2.length-1 ){
            // Body
            w2+= word2[i];
            i++;
        }

        return w1.equals(w2);
    }
}