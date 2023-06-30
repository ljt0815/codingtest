import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 귤번호, 갯수
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++)
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        // 귤 갯수 정렬을 위한 리스트
        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        // 순서를 보장하기 위해 링크드해쉬맵에 데이터 추가
        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        // 탐욕적 귤담기(많은것부터 차례대로 넣기)
        int ret = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            ret++;
            k -= entry.getValue();
            if (k <= 0)
                break ;
        }
        return ret;
    }
}