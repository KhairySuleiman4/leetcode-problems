class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                break;
            }
            if(doesContainEvenNumberOfDigits(nums[i])){
                result++;
            }
        }
        return result;
    }

    private boolean doesContainEvenNumberOfDigits(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        if(count % 2 == 0){
            return true;
        } else{
            return false;
        }
    }
}