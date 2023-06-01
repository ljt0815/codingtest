import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] d, int budget) {
        List<Integer> list 
                = Arrays.stream(d)
                        .boxed().sorted()
                        .collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            budget -= list.get(i);
            if (budget < 0)
                return i;
        }
        return list.size();
    }
}