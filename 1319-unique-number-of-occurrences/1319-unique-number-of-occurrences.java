class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }

        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            if(!set.add(i.getValue())){
                return false;
            }
        }
        return true;
    }
}