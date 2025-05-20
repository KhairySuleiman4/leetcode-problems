class Solution {
    public String defangIPaddr(String address) {
        String[] parts = address.split("[.]");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < 3; i++){
            sb.append(parts[i] + "[.]");
        }
        sb.append(parts[parts.length - 1]);
        return sb.toString();
    }
}