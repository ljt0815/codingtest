import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int score : scoville)
            pq.add(score);
        int cnt = 0;
        while (pq.size() >= 2) {
            int num1 = pq.poll();
            int num2 = pq.poll();
            if (num1 >= K)
                return cnt;
            int newScoville = num1 + num2 * 2;
            pq.add(newScoville);
            cnt++;
        }
        if (pq.size() > 0) {
            int num = pq.poll();
            if (num >= K)
                return cnt;
        }
        return -1;
    }
}