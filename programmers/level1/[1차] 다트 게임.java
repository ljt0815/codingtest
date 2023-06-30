class Solution {
    public int solution(String dartResult) {
        int i = 0;
        int index = 0;
        int[] score = new int[3];
        while (i < dartResult.length()) {
            int num = 0;
            while (isNumber(dartResult.charAt(i)))
                num = (num * 10) + (int)(dartResult.charAt(i++) - '0');
            if (i < dartResult.length() && isSDT(dartResult.charAt(i)))
                num = (int)Math.pow(num, sdtFunc(dartResult.charAt(i++)));
            if (i < dartResult.length() && isOption(dartResult.charAt(i))) {
                if (dartResult.charAt(i) == '*') {
                    num *= 2;
                    if (index != 0)
                        score[index - 1] *= 2;
                } else {
                    num *= -1;
                }
                i++;
            }
            score[index++] = num;
        }
        return score[0] + score[1] + score[2];
    }
    
    public boolean isNumber(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }
    public boolean isSDT(char ch) {
        if (ch == 'S' || ch == 'D' || ch == 'T')
            return true;
        return false;
    }
    public boolean isOption(char ch) {
        if (ch == '*' || ch == '#')
            return true;
        return false;
    }
    public int sdtFunc(char ch) {
        if (ch == 'S')
            return 1;
        if (ch == 'D')
            return 2;
        if (ch == 'T')
            return 3;
        return -1;
    }
}