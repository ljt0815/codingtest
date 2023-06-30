class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] fillSection = new boolean[100001];
        // true면 색칠해야함 false면 색칠됨
        
        // 페인트 벗겨내기
        for (int i = 0; i < section.length; i++)
            fillSection[section[i]] = true;
        // 탐욕적 페인트칠하기
        int i = 0;
        int ret = 0;
        while (!successCheck(fillSection)) {
            // 만약 원소위치의 색이 벗겨져있다면
            if (fillSection[section[i]]) {
                // section 원소부터 m만큼 칠하기
                for (int j = section[i]; j < section[i] + m; j++) {
                    if (j <= 100000 && fillSection[j])
                        fillSection[j] = false;
                }
                ret++;
            }
            i++;            
        }
        return ret;
    }
    
    public boolean successCheck(boolean[] fillSection) {
        for (int i = 1; i <= 100000; i++) {
            if (fillSection[i])
                return false;
        }
        return true;
    }
}