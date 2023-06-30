class Solution {
    public int solution(int num) {
        long longNum = (long)num;
        if (longNum == 1)
            return 0;
        for (int i = 0; i < 500; i++) {
            if (longNum == 1)
                return i;
            if (longNum % 2 == 0)
                longNum = longNum / 2;
            else
                longNum = (longNum * 3) + 1;
        }
        return -1;
    }
}