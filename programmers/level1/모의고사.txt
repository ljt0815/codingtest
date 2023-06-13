class Solution {
    public int[] solution(int[] answers) {
        int[][] people = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        // 맞춘 개수 찾기
        int[] solvedPeople = new int[3];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (people[j][i % people[j].length] == answers[i])
                    solvedPeople[j]++;
            }
        }
        // 최대값 구하기
        int max = -2147483648;
        int len = 0;
        int[] tmp = new int[3];
        for (int i = 0; i < 3; i++)
            max = Math.max(solvedPeople[i], max);
        // 최대값 길이 세기
        for (int i = 0; i < 3; i++)
            if (max == solvedPeople[i]) {
                len++;
                tmp[i] = i + 1;
            }
        // 리턴 배열 생성
        int[] ret = new int[len];
        int index = 0;
        for (int i = 0; i < 3; i++)
            if (tmp[i] != 0)
                ret[index++] = tmp[i];
        return ret;
    }
}