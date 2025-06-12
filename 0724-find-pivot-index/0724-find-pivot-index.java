class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
            return -1;
        else if(nums.length == 1)
            return 0;

        int sumLeft = 0;
        int sumRight = 0;

        for(int i = 1; i < nums.length; i++){
            sumRight += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(sumRight == sumLeft){
                return i;
            }
            sumLeft += nums[i];
            if(i != (nums.length - 1)){
                sumRight -= nums[i + 1];
            }
        }

        return -1;
    }
}
