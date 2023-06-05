class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] ret = new String[n];
        for (int i = 0; i < n; i++) {
            ret[i] = Integer.toString(arr1[i] | arr2[i], 2).replace('0', ' ').replace('1', '#');
            if (ret[i].length() != n) {
                String tmp = "";
                for (int j = 0; j < n - ret[i].length(); j++) {
                    tmp += ' ';
                }
                ret[i] = tmp + ret[i];           
            }
        }
        return ret;
    }
}