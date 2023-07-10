import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++)
            list.add((int)Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        int prev = list.get(0);
        int cnt = 1;
        for (int i = 1; i < list.size(); i++) {
            if (prev >= list.get(i))
                cnt++;
            else {
                tmp.add(cnt);
                cnt = 1;
                prev = list.get(i);
            }
        }
        tmp.add(cnt);
        int[] ret = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++)
            ret[i] = tmp.get(i);
        return ret;
    }
}