public long solution(int price, int money, int count) {
        long answer = money;
        int minus = price;
        
        for (int i = 0; i < count; i++) {
            answer -= minus;
            minus += price;
        }
        
        if (answer > 0)
            return 0;
        return -1 * answer;
    }