class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        
        while (n >= a) {
            int emptyBottle = (n % a);
            sum = sum + (n / a) * b;
            n = (n / a) * b + emptyBottle;
        }
        return sum;
    }
}