import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int[] ret = new int[2];
        // 이전단어의 마지막글자
        char prevLast = words[0].charAt(words[0].length() - 1);
        // 중복체크를 위한 단어 추가
        map.put(words[0], map.getOrDefault(words[0], 0) + 1);
        
        int i;
        for (i = 1; i < words.length; i++) {
            // 현재단어의 첫글자와 전 마지막글자 변수 비교
            if (!(words[i].charAt(0) == prevLast))
                break ;
            // 현재단어가 나온적 있는지 비교
            else if (map.get(words[i]) != null)
                break ;
            // 다음 체크를 위해 현재단어의 마지막글자로 변경
            prevLast = words[i].charAt(words[i].length() - 1);
            // 중복체크를 위한 단어 추가
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        
        // 끝까지 왔다면 0,0 반환
        if (i == words.length)
            return new int[] {0, 0};
        // 정답
        ret[0] = i % n + 1;
        ret[1] = i / n + 1;
        return ret;
    }
}