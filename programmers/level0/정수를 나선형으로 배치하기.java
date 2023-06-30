class Solution {
    public int[][] solution(int n) {
        // 값 초기화
        
        int[][] answer = new int[n][n];
        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int curDir = 0;
        int px = 0;
        int py = 0;
        int npx = 0;
        int npy = 0;
        
        // 배열 순회
        
        for (int i = 1; i <= n*n; i++) {
            answer[px][py] = i;
            
            npx = px + dir[curDir][0];
            npy = py + dir[curDir][1];
            // 길 막히면 방향전환
            if (npx >= n || npy >= n || npx < 0 || npy < 0 || answer[npx][npy] != 0) {
                curDir = (curDir + 1) % 4;
                
                npx = px + dir[curDir][0];
                npy = py + dir[curDir][1];
            }
            px = npx;
            py = npy;
        }
        return answer;
    }
}