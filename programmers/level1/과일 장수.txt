public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int result = 0;
        int i = score.length - 1;
        while (i >= 0) {
            int min = 2147483647;
            boolean isBreak = false;
            // m번만 반복
            for (int j = 0; j < m; j++) {
                if (i < 0) {
                    isBreak = true;
                    break ;                    
                }
                min = Math.min(score[i--], min);
            }
            if (isBreak)
                break ;
            result += (min * m);
        }
        return result;
    }