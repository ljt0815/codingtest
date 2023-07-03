class Solution {
    public int[] solution(int n, long left, long right) {
        int[] ret = new int[(int)(right - left) + 1];
        int idx = 0;
        for (long i = left; i <= right; i++) {
            int y = (int)(i / n) + 1;
            int x = (int)(i % n) + 1;
            ret[idx++] = x >= y ? x : y; 
        }
        return ret;
    }
}