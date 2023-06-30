import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                num.add(i);
                if (n / i != i)
                    num.add(n / i);
            }
        }
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }
        return sum;
    }
}