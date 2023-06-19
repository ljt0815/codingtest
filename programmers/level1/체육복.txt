class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 2];
        int ret = 0;
        for (int i = 1; i <= n; i++)
            student[i] = 1;
        for (int i = 0; i < reserve.length; i++)
            student[reserve[i]]++;
        for (int i = 0; i < lost.length; i++)
            student[lost[i]]--;
        for (int i = 1; i <= n; i++) {
            if (student[i] == 0) {
                if (student[i - 1] == 2) {
                    student[i - 1]--;
                    student[i]++;
                }
                else if (student[i + 1] == 2) {
                    student[i + 1]--;
                    student[i]++;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (student[i] >= 1)
                ret += 1;
        }
        return ret;
    }
}