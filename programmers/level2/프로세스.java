import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer[]> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++)
            q.offer(new Integer[] {priorities[i], i});
        for (int i = 0; !q.isEmpty(); i++) {
            Integer[] p = q.poll();
            boolean isOffer = false;
            for (Integer[] tmp: q) {
                if (p[0] < tmp[0]) {
                    q.offer(p);
                    isOffer = true;
                    break ;
                }
            }
            if (!isOffer)
                list.add(p[1]);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == location)
                return i + 1;
        }
        return -1;
    }
}