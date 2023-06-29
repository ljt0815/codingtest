class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++)
            lcm = LCM(arr[i], lcm);
        return lcm;
    }
    
    int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a%b);
    }
    
    int LCM(int a, int b) {
        return a * b / GCD(a,b);
    }
}