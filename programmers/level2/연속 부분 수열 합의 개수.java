import java.util.*;
class Solution {
	
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] newEle = Arrays.copyOf(elements, elements.length * 2 - 1);
        for (int i = elements.length; i < newEle.length; i++) {
        	newEle[i] = elements[i - elements.length];
        }
        
        // 1 ~ (n - 1)
        for (int i = 1; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++)
                    sum += newEle[k];
                set.add(sum);
            }
        }
        // n
        int sum = 0;
        for (int i = 0; i < elements.length; i++)
            sum += elements[i];
        set.add(sum);

        return set.size();
    }
}