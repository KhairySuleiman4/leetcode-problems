class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        while(n > 0){
            if(isDivisable(n)){
                sum += n;
            }
            n--;
        }
        return sum;
    }

    private boolean isDivisable(int num){
        return num % 3 == 0 || num % 5 == 0 || num % 7 == 0;
    }
}