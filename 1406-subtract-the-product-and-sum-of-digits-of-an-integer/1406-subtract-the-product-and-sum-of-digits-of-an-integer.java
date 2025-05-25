class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer> nums = new ArrayList<>();
        int temp = n;
        int mul = 1;
        int sum = 0;
        
        do{
            nums.add(temp % 10);
            temp /= 10;
        }while(temp != 0);

        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
            mul *= nums.get(i);
        }
        return mul - sum;
    }
}