import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = "" + n;
        List<Integer> list = new ArrayList<>();
        
        
        for (int i = 0; i < str.length(); i++) {
            list.add((int)(str.charAt(i) - '0'));
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        long rtn = 0;
        
        for (int i = 0; i < list.size(); i++) {
            rtn = (rtn * 10) + list.get(i);
        }
        
        return rtn;
        
    }
}