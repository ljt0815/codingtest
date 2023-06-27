import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++)
            map.put(players[i], i);
        
        for (int i = 0; i < callings.length; i++) {
            int place = map.get(callings[i]);
            String tmp = players[place - 1];
            players[place - 1] = players[place];
            players[place] = tmp;
            map.put(callings[i], place - 1);
            map.put(tmp, place);
        }
        return players;
    }
}