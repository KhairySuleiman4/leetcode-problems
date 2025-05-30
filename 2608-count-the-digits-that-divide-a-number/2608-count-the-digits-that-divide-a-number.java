class Solution {
    public int countDigits(int num) {
        int count = 0;
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) - '0';
            if(num % digit == 0 && digit != 0){
                count++;
            }
        }
        return count;
    }

    private boolean isDivisible(int numerator, int denominator){
        return numerator % denominator == 0;
    }
}