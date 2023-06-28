class Solution {
    public int solution(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            int sum = i;
            for (int j = i + 1; sum < n; j++)
                sum += j;
            if (sum == n)
                ret++;
        }
        return ret;
    }
}