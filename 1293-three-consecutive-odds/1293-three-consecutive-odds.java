class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(i >= 2){
                if(isOdd(arr[i]) && isOdd(arr[i - 1]) && isOdd(arr[i - 2])){
                    return true;
                }
            }
        }
        return false;
    }

    boolean isOdd(int num){
        return num % 2 != 0;
    }
}