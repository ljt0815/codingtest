import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (!find(numbers, i))
                sum += i;
        }
        return sum;
    }
    
    public boolean find(int[] numbers, int target) {
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] == target)
                return true;
        }
        return false;
    }
}