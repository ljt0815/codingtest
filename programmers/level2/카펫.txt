import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        //yellow의 가로x세로 약수 구하기
        int i;
        for (i = 1; i <= (int)Math.sqrt(yellow); i++) 
            if (yellow % i == 0)
                //가로 * 2 + 세로 * 2 + 4 가 브라운이면 그거 리턴하면 될듯
                if (brown == ((yellow / i) * 2) + (i * 2) + 4)
                    break ;
        return new int[] {Math.max(yellow / i, i) + 2, Math.min(yellow / i, i) + 2};
    }
}