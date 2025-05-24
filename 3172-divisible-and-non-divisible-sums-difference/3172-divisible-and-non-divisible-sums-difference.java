class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0;
        int notDiv = 0;

        for(int i = n; i > 0; i--){
            if(n % m == 0){
                div += n--;
            } else{
                notDiv += n--;
            }
        }

        return notDiv - div;
    }
}