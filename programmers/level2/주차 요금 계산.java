import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < records.length; i++) {
            String[] str = records[i].split(" ");
            Integer time = Integer.parseInt(str[0].split(":")[0]) * 60;
            time += Integer.parseInt(str[0].split(":")[1]);
            Integer old = map.get(str[1]);
            if (old == null)
                old = 0;
            if (str[2].equals("IN")) {
                map.put(str[1], old - time);
                set.add(str[1]);
            }
            else {
                map.put(str[1], old + time);
                set.remove(str[1]);
            }
        }
        for (String tmp: set) {
            Integer old = map.get(tmp);
            map.put(tmp, old + 1439);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int i = 0;
        int[] ret = new int[list.size()];
        for (String tmp: list) {
            int time = map.get(tmp);
            int pay = fees[1];
            if (time > fees[0])
                pay += (Math.ceil((double)(time - fees[0]) / fees[2]) * fees[3]);
            ret[i++] = pay;
        }
        return ret;
    }
}