class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) { 
            int cnt = 0;
            //약수 구하기
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++; //약수 중 작은수
                    if (i / j != j)
                        cnt++; // 약수 중 큰 수
                }                    
            }
            sum = (cnt % 2 == 0) ? sum + i : sum - i;
        }
        return sum;
    }
}