class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int currentValue = map.getOrDefault(nums[i], 0);
            map.put(nums[i], currentValue + 1);
        }
        
        int major = nums[0];
        int maxCount = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                major = entry.getKey();
            }
        }
        return major;
    }
}