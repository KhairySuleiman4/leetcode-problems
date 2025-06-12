class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] num = s.toCharArray();
        
        for(int i = num.length - 1; i >= 0; i--){
            if(num[i] == 'V'){
                if(i > 0 && num[i - 1] == 'I'){
                    sum += 4;
                    i--;
                } else{
                    sum += 5;
                }
            } else if(num[i] == 'X'){
                if(i > 0 && num[i - 1] == 'I'){
                    sum += 9;
                    i--;
                } else{
                    sum += 10;
                }
            } else if(num[i] == 'L'){
                if(i > 0 && num[i - 1] == 'X'){
                    sum += 40;
                    i--;
                } else{
                    sum += 50;
                }
            } else if(num[i] == 'C'){
                if (i > 0 && num[i - 1] == 'X'){
                    sum += 90;
                    i--;
                } else{
                    sum += 100;
                }
            } else if(num[i] == 'D'){
                if (i > 0 && num[i - 1] == 'C'){
                    sum += 400;
                    i--;
                } else{
                    sum += 500;
                }
            } else if(num[i] == 'M'){
                if (i > 0 && num[i - 1] == 'C'){
                    sum += 900;
                    i--;
                } else{
                    sum += 1000;
                }
            } else if(num[i] == 'I'){
                sum += 1;
            }
        }
        return sum;
    }
}
