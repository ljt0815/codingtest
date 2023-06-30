import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[] {-1};
        Integer b[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> list = new ArrayList<>(Arrays.asList(b));
        list.remove(list.indexOf(Collections.min(list)));
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}