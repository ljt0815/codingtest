import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[] me = new int[2];
        int[][] map = new int[park.length][park[0].length()];
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'X')
                    map[i][j] = 1;
                else if (park[i].charAt(j) == 'S')
                    me = new int[]{i, j}; 
            }
        }
        for (int i = 0; i < routes.length; i++)
            check(routes[i].charAt(0), routes[i].charAt(2) - '0', me, map);
        return me;
    }
    
    public void check(char d, int count, int[] me, int[][] map) {
        char[] dd = {'E', 'S', 'W', 'N'};
        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int curdir = -1;
        int y = me[0];
        int x = me[1];
        for (int i = 0; i < 4; i++)
            if (d == dd[i])
                curdir = i;
        for (int i = 0; i < count; i++) {
            y += dir[curdir][0];
            x += dir[curdir][1];
            if (x < 0 || y < 0 || y >= map.length || x >= map[y].length || map[y][x] == 1)
                return ;
        }
        me[0] = y;
        me[1] = x;
        return ;
    }
}