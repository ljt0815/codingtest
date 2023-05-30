class Solution {
    public long solution(int a, int b) {
        
        int big, small;
        
        if (a > b) {
            big = a;
            small = b;
        }
        else if (a == b) {
            return a;
        }
        else {
            big = b;
            small = a;
        }
        return (long)((long)(big - small + 1) * (big + small)) / 2;
    }
}