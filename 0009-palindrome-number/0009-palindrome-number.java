class Solution {
    // 5672
    // 1- r = temp % 10
    // 2- temp = temp / 10
    // 3- r = (r * 10) + (temp % 10)
    // 2765
    public boolean isPalindrome(int x) {
        int temp = x;
        int r = 0;
        while(temp != 0){
            r = (r * 10) + (temp % 10);
            temp = temp / 10;
        }
        if(x < 0)
            return false;
        else if(x == r)
            return true;
        else
            return false;
    }
}