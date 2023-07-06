import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        List<String>[] clothesType;
        for (int i = 0; i < clothes.length; i++) {
            List<String> tmp = map.get(clothes[i][1]);
            if (tmp == null)
                tmp = new ArrayList<String>();
            tmp.add(clothes[i][0]);
            map.put(clothes[i][1], tmp);
        }
        int index = 0;
        clothesType = new ArrayList[map.size()];
        for (String m : map.keySet())
            clothesType[index++] = map.get(m);
        int ret = 1;
        for (int i = 0; i < clothesType.length; i++)
            //옷의 종류중 입지 않는경우를 +1해서 계산한다.
            ret *= (clothesType[i].size() + 1);
        // 아무것도 입지않은 경우 한가지만 빼서 제출한다.
        return ret - 1;
    }
}