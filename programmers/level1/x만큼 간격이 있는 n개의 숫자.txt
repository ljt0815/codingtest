class Solution {
    public long[] solution(int x, int n) {
        long[] ret = new long[n];
        for (int i = 1; i <= n; i++) {
            ret[i - 1] = (long)((long)x * (long)i);
        }
        return ret;
    }
}