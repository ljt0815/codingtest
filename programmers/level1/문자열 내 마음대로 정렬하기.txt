import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] ret = new String[strings.length];
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < strings.length; i++) {
            map.put(i, (char)strings[i].charAt(n) + strings[i]);            
        }
        // n번째를 기준으로 정렬
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o1).compareTo(map.get(o2)));
        
        int i = 0;
        for (Integer key : keySet) {
            ret[i++] = strings[key];
        }
        return ret;
    }
}