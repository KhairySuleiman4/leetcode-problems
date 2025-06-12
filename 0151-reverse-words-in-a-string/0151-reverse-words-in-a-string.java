class Solution {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        String[] strs = s.split(" ");
        for(int i = strs.length - 1; i >= 0; i--){
            if(!strs[i].equals("")){
                stringBuilder.append(strs[i].trim() + " ");
            }
        }
        return stringBuilder.toString().trim();
    }
}