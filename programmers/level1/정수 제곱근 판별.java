import java.util.*;

class Solution {
    public long solution(long n) {
        double tmp = Math.sqrt(n);
        int num = (int)tmp;
        
        if (tmp - num > 0)
            return -1;
        else
            return (long)Math.pow(tmp + 1, 2);
    }
}