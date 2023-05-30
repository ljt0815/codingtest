import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = cutArray(arr, 0, query[i]);
            } else {
                arr = cutArray(arr, query[i], arr.length - 1);
            }
        }
        return arr;
    }
    
    public int[] cutArray(int[] arr, int start, int end) {
        int[] ret = new int[end - start + 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arr[i + start];
        }
        return ret;
    }
}