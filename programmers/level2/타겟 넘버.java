class Solution {
    public void dfs(int[] numbers, int target, int depth, int result, int[] ret) {
        if (depth == numbers.length) {
            if (result == target)
                ret[0] += 1;
            return ;
        }
        dfs(numbers, target, depth + 1, result + numbers[depth], ret);
        dfs(numbers, target, depth + 1, result - numbers[depth], ret);
    }
    public int solution(int[] numbers, int target) {
        int[] ret = new int[]{0};
        dfs(numbers, target, 0, 0, ret);
        return ret[0];
    }
}