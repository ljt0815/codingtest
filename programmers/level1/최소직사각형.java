class Solution {
    public int solution(int[][] sizes) {
        int tmp = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if (maxWidth < sizes[i][0])
                maxWidth = sizes[i][0];
            if (maxHeight < sizes[i][1])
                maxHeight = sizes[i][1];
        }
        return maxWidth * maxHeight;
    }
}