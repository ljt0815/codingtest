import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> dict = new HashMap<>();
        int margin = 1;
        // 1. 사전을 초기화
        Integer idx;
        for (idx = 0; idx < 26; idx++)
            dict.put("" + (char)('A'+idx), idx + 1);
        for (int i = 0; i < msg.length(); i++) {
            int j = msg.length() - 1;
            String target = null;
            // 2. 사전에서 가장 긴문자열 찾기
            while (j >= i) {
                target = msg.substring(i, j + margin);
                // System.out.println(target);
                if (dict.containsKey(target))
                    break ;
                j--;
            }
            // 다음글자 포함해서 사전에 추가
            // System.out.println("넣을타겟!" + target);
            list.add(dict.get(target));
            if (j != msg.length() - 1)
                dict.put(msg.substring(i, j + 1 + margin), ++idx);
            i = j;
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ret[i] = list.get(i);
        return ret;
    }
}