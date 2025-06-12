class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set s = new HashSet();
        for(int num: nums){
            s.add(num);
        }
        if(s.size() == nums.length){
            return false;
        } else  return true;
    }
}