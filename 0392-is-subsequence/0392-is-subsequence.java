class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }

        int j = 0;
        for(int i = 0; i < s.length(); i++){
            boolean isFound = false;

            while(j < t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    isFound = true;
                    j++;
                    break;
                }
                j++;
            }

            if(!isFound){
                return false;
            }
        }
        return true;
    }
}