class Solution {
    public int solution(int number, int limit, int power) {
        int[] member = new int [number + 1];
        for (int j = 1; j <= number; j++) {
            int len = 0;
            for(int i = 1; i <= Math.sqrt(j); i++){
                if(j % i == 0){ // 약수 중 작은 수 저장
                    len++;
                    if(j / i != i){ // 약수 중 큰 수 저장
                        len++;
                    }
                }
            }
            member[j] = len;
        }
        int ret = 0;
        for (int i = 1; i <= number; i++) {
            if (member[i] > limit)
                ret += power;
            else
                ret += member[i];
        }
        return ret;
    }
}