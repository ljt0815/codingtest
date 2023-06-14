class Solution {
    public int solution(int n) {
        boolean check[] = new boolean[1000001];
        check[0] = check[1] = true;
        for (int i = 2; i < Math.sqrt(1000000); i++)
            if (check[i] == false) 
                for (int j = i + i; j <= 1000000; j += i)
                    check[j] = true;
        int cnt = 0;
        for (int i = 0; i <= n; i++)
            if (!check[i])
                cnt++;
        return cnt;
    }
}