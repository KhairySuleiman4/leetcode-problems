class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int temp = start;
        for(int i = 0; i < n; i++){
            arr[i] = temp;
            temp += 2;
        }
        temp = start;
        for(int i = 1; i < n; i++){
            temp = temp ^ arr[i];
        }
        return temp;
    }
}