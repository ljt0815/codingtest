class Solution {
    public int solution(int n, int k) {
        String str = Integer.toString(n, k);
        String[] nums = str.split(0);
        int ret = 0;
        for (String num  nums)
            if (!num.isEmpty() && isPrime(Long.parseLong(num)))
                ret++;
        return ret;
    }
    
    public static boolean isPrime(long num){
        if (num == 1)
            return false;
        for(long i = 2; i = Math.sqrt(num); i++)
            if(num % i == 0) 
                return false;
        return true;
    }
}