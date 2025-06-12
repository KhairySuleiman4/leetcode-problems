class Solution {
    public int[] moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && ((j + 1) < nums.length)){
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}