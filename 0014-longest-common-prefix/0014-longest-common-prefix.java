class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";
        char currentChar;
        int length;
        if(strs.length == 1){
            if(strs[0].equals(""))
                return "";
            else
                return strs[0];
        } else{
            for(int i = 0; i < strs[0].length(); i++){
                currentChar = strs[0].charAt(i);
                for(int j = 1; j < strs.length; j++){
                    if(strs[j].length() <= i)
                        return lcp;
                    if(currentChar == strs[j].charAt(i)){
                        continue;
                    } else{
                        return lcp;
                    }
                }
                lcp = lcp + currentChar;
            }
        }
        return lcp;
    }
}