import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            BigInteger bi1 = new BigInteger(t.substring(i, i + p.length()));
            BigInteger bi2 = new BigInteger(p);
            int compare = bi1.compareTo(bi2);
            if (compare == -1 || compare == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}