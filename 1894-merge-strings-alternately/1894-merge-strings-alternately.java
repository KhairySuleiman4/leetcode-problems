class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str = "";
        int dif = word1.length() - word2.length();
        if(dif == 0){
            str = mergeEquals(word1, word2);
        } else if(dif > 0){
            str = mergeBigWithSmall(word1, word2);
        } else {
            str = mergeSmallWithBig(word1, word2);
        }
        return str;
    }

    private String mergeBigWithSmall(String big, String small) {
        String str = "";
        for(int i = 0; i < small.length(); i++){
            str = str + big.charAt(i) + small.charAt(i);
        }
        str = str + big.substring(small.length());
        return str;
    }

    private String mergeSmallWithBig(String small, String big){
        String str = "";
        for(int i = 0; i < small.length(); i++){
            str = str + small.charAt(i) + big.charAt(i);
        }
        str = str + big.substring(small.length());
        return str;
    }

    private String mergeEquals(String word1, String word2){
        String str = "";
        for(int i = 0; i < word1.length(); i++){
            str = str + word1.charAt(i) + word2.charAt(i);
        }
        return str;
    }
}