import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int result = 0;
        
        for (int tmp: A)
            a.add(tmp);
        for (int tmp: B)
            b.add(tmp);
        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());
        
        for (int i = 0; i < A.length; i++)
            result += (a.get(i) * b.get(i));
        
        return result;
    }
}
