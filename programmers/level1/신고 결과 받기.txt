import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>();
        Map<String, StringBuilder> reportedName = new HashMap<>();
        Map<String, Integer> reportedCount = new HashMap<>();
        Map<String, Integer> idx = new HashMap<>();
        int[] email = new int[id_list.length];
        // 중복제거
        for (int i = 0; i < report.length; i++)
            set.add(report[i]);
        
        // 신고횟수, 신고한사람 카운트
        for (String str : set) {
            String[] tmp = str.split(" ");
            reportedCount.put(tmp[1], reportedCount.getOrDefault(tmp[1], 0) + 1);
            reportedName.put(tmp[1], reportedName.getOrDefault(tmp[1], new StringBuilder(" ")).append(" " + tmp[0]));
        }
        // 유저 id 맵핑
        int i = 0;
        for (String id : id_list) {
            idx.put(id, i++);
        }
        
        // 리폿카운트를 순회하며 k보다 높으면 신고자들에게 메일보내기(email[인덱스]++)
        for (String name : reportedCount.keySet()) {
            if (reportedCount.get(name) >= k) {
                String[] tmp = reportedName.get(name).toString().split(" ");
                for (String names : tmp)
                    if (!names.isEmpty())
                        email[idx.get(names)]++;
            }
        }
        return email;
    }
}