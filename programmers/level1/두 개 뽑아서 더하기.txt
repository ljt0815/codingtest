class Solution {
    public int[] solution(int[] numbers) {
        boolean[] nums = new boolean[200];
        int cnt = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!nums[numbers[i] + numbers[j]]) {
                    nums[numbers[i] + numbers[j]] = true;
                    cnt++;                    
                }
            }
        }
        int[] ret = new int[cnt];
        int index = 0;
        for (int i = 0; i < 200; i++) {
            if (nums[i]) {
                ret[index++] = i;
            }
        }
        return ret;
    }
}