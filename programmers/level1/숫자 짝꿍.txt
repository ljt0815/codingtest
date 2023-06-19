import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];
        StringBuilder realret = new StringBuilder();
        
        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            y[Y.charAt(i) - '0']++;
        }
        
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(x[i], y[i]); j++) {
                realret.append(i);
            }
        }
        
        if (realret.toString().isEmpty())
            return "-1";
        if (realret.toString().charAt(0) == '0')
            return "0";
        return realret.toString();
    }
}