class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            int current = map.getOrDefault(i, 0);
            if(current == 0){
                map.put(i, 1);
            } else{
                map.put(i, current + 1);
            }
        }

        for(Map.Entry<Integer, Integer> me: map.entrySet()){
            if(me.getValue() == 1){
                return me.getKey();
            }
        }

        return 0;
    }
}