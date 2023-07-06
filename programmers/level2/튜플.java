import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<List<Integer>> parsing = new ArrayList<>();
        
        // 파싱작업
        for (int i = 1; i < s.length(); i++) {
            List<Integer> tmp = new ArrayList<>();
            int num = 0;
            if (s.charAt(i) == '{') {
                while (s.charAt(++i) != '}') {
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                        num = (num * 10) + (s.charAt(i) - '0');
                    else {
                        tmp.add(num);
                        num = 0;
                    }
                }
                if (num != 0)
                    tmp.add(num);
                parsing.add(tmp);
            }
        }
        // 리스트의 사이즈순으로 정렬
        parsing.sort((a, b) -> a.size() - b.size());
        // 링크드셋으로 중복제거, 순서보장
        Set<Integer> retSet = new LinkedHashSet<>();
        for (int i = 0; i < parsing.size(); i++)
            for(int j = 0; j < parsing.get(i).size(); j++)
                retSet.add(parsing.get(i).get(j));
        int[] ret = new int[retSet.size()];
        int index = 0;
        for (Integer rs : retSet)
            ret[index++] = rs;
        return ret;
    }
}