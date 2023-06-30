class Solution {
    public int[] solution(int n, int m) {
        int gdc = GCD(n, m);
        return new int[] {gdc, n * m / gdc};
    }
    
    public int GCD(int a, int b) {
       if (b == 0) return a;
        else return GCD(b, a%b);
    }
}