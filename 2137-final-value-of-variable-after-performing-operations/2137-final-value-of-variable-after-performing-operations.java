class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for(String op: operations){
            switch(op){
                case "X++":
                case "++X":
                    num++;
                    break;
                case "X--":
                case "--X":
                    num--;
                    break;
                default: break;
            }
        }
        return num;
    }
}