import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[7];
        ArrayList<Integer> one = new ArrayList<>();
        int two = -1;
        int subTwo = -1;
        int three = -1;
        int four = -1;

        dice[a]++;
        dice[b]++;
        dice[c]++;
        dice[d]++;
        for (int i = 1; i <= 6; i++) {
            if (two == -1 && dice[i] == 2)
                two = i;
            else if (dice[i] == 1)
                one.add(i);
            else if (dice[i] == 2)
                subTwo = i;
            else if (dice[i] == 3)
                three = i;
            else if (dice[i] == 4)
                four = i;
        }
        if (four != -1) {
            return four * 1111;
        }
        else if (three != -1) {
            return (int)Math.pow(three * 10 + one.get(0), 2);
        }
        else if (two != -1) {
            if (subTwo != -1) {
                return (two + subTwo) * Math.abs(subTwo - two);
            }
            else {
                return one.get(0) * one.get(1);
            }
        }
        else {
            return Collections.min(one);
        }
    }
}