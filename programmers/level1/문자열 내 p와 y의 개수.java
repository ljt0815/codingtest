class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String tmp = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == 'p')
                pCnt++;
            else if(tmp.charAt(i) == 'y')
                yCnt++;
        }
        
        if (pCnt == yCnt)
            return true;
        return false;
    }
}