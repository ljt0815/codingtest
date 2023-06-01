import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<>();
        int current = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == current)
                continue;
            list.add(arr[i]);
            current = arr[i];
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}