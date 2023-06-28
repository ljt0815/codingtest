class Solution {
    public int solution(int n) {
        int oneLen = getOneLen(Integer.toString(n, 2));
                
        while (true) {
            int nextOneLen = getOneLen(Integer.toString(++n, 2));
            if (nextOneLen == oneLen)
                break;
        }
        return n;
    }
    
    public int getOneLen(String str) {
        int oneLen = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == '1')
                oneLen++;
        return oneLen;
    }
}