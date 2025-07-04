class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        for(int i = 0; i < sb.length() / 2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}