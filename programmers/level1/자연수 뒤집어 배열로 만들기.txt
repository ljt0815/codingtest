import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        List<Integer> list = new ArrayList<>();
        
        int[] answer;
        int index = 0;
        while (n > 0) {
            list.add((int)(n % (long)10));
            n /= 10;
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}