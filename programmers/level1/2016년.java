public String solution(int a, int b) {
        int day = 0;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        for (int i = 0; i < a - 1; i++) {
            day += month[i];
        }
        day = day + (b - 1);
        return dayOfTheWeek[(day) % 7];
    }