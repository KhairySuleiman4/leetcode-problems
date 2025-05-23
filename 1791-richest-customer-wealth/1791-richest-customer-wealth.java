class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int[] wealths = new int[n];
        for(int i = 0; i < n; i++){
            int banks = accounts[i].length;
            int sum = 0;
            for(int j = 0; j < banks; j++){
                sum += accounts[i][j];
            }
            wealths[i] = sum;
        }
        int max = wealths[0];
        for(int i = 0; i < wealths.length; i++){
            if(wealths[i] > max){
                max = wealths[i];
            }
        }
        return max;
    }
}