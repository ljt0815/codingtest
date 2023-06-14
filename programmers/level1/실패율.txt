import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageSize = new int[N + 2];
        // 현재 스테이지 카운트(분자)
        for (int j = 0; j < stages.length; j++)
            stageSize[stages[j]]++;
        // 도달한 사람 세기(분모)
        int[] arrived = new int[N + 2];
        // 끝에 도달한 사람은 마지막탄성공
        arrived[N + 1] = stageSize[N + 1];
        // 뒤 스테이지에 도달한 사람은 현재스테이지는 이미 도달함 
        for (int i = N; i >= 1; i--)
            arrived[i] += (arrived[i + 1] + stageSize[i]);
        List<double[]> fail_rate = new ArrayList<>();
        for (int i = 1; i <= N; i++)
            fail_rate.add(new double[]{i,arrived[i] == 0 ? 0 : (double)stageSize[i]/arrived[i]});
        // 실패율을 내림차순으로 정렬, 실패율이 같다면 스테이지를 오름차순으로 정렬
        fail_rate.sort((a,b) -> {
            int cmp = Double.compare(b[1],a[1]);
            if (cmp != 0) {
                return cmp;
            }
            return Double.compare(a[0],b[0]);
        });
        // 인덱스 형변환 후 제출        
        int[] ret = new int[N];
        for (int i = 0; i < fail_rate.size(); i++) {
            ret[i] = (int)fail_rate.get(i)[0];
        }
        return ret;
    }
}