import java.util.*;
class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while (true) {
            answer++;
            if (a == b)
                break ;
            if (Math.max(a, b) % 2 == 0 && Math.abs(a - b) == 1)
                break ;
            a = (a + 1) / 2;
            b = (b + 1) / 2; 
        }
        return answer;
    }
}