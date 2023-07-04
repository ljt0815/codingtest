import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();
        int time = 0;
        if (cacheSize == 0)
            return cities.length * 5;
        for (String s : cities) {
            s = s.toLowerCase();
            if (queue.isEmpty())
                time += 5;
            else if (isincity(queue, s)) {
                time += 1;
                queue.remove(s);
            }
            else
                time += 5;
            if (queue.size() == cacheSize)
                queue.poll();
            queue.add(s);
        }
        return time;
    }
    
    public boolean isincity(Queue<String> queue, String city) {
        for (String q : queue) {
            if (q.equals(city))
                return true;
        }
        return false;
    }
}