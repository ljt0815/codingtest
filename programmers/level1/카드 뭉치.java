class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < goal.length; k++) {
            boolean fail1 = false;
            boolean fail2 = false;
            if (i < cards1.length) {
                if (!cards1[i].equals(goal[k])) {
                    fail1 = true;
                } else {
                    i++;
                }
            } else {
                fail1 = true;
            }
            if (j < cards2.length) {
                if (!cards2[j].equals(goal[k])) {
                    fail2 = true;
                } else {
                    j++;                
                }
            } else {
                fail2 = true;
            }
            if (fail1 && fail2)
                return "No";
        }
        return "Yes";
    }
}