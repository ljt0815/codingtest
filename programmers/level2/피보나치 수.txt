import java.util.*;
import java.math.*;
class Solution {
    public int solution(int n) {
        BigInteger[] fivo = new BigInteger[100001];
        BigInteger mod = new BigInteger("1234567");
        fivo[0] = new BigInteger("0");
        fivo[1] = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            fivo[i] = fivo[i - 2].add(fivo[i - 1]);    
        }
        return fivo[n].remainder(mod).intValue();
    }
}