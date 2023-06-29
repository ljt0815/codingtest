import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int ret = 0;
        int j = 0;
        for (int i = people.length - 1; i >= j; i--) {
            if (i != j && people[i] + people[j] <= limit)
                j++;
            ret++;
        }
        return ret;
    }
}