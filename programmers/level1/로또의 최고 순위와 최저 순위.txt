class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int same = 0;
        int zero = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue ;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j])
                    same++;
            }
        }
        return new int[]{7 - (zero + same) > 6 ? 6 : 7 - (zero + same), 7 - (same) > 6 ? 6 : 7 - (same)};
    }
}