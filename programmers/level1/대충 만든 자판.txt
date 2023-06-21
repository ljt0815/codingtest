class Solution {
    public int findNearTarget(String[] keymap, char target) {
        int min = 2147483647;
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (j >= min)
                    break ;
                if (keymap[i].charAt(j) == target) {
                    min = j;
                    break ;
                }
            }
        }
        if (min == 2147483647)
            return -1;        
        return min + 1;        
    }
    
    public int[] solution(String[] keymap, String[] targets) {
        int[] alphabets = new int[26];
        int[] ret = new int[targets.length];
        for (int i = 0; i < alphabets.length; i++)
            alphabets[i] = findNearTarget(keymap, (char)(i + 'A'));
        
        for (int i = 0; i < targets.length; i++) {
            int dis = 0;
            boolean flag = false;
            for (int j = 0; j < targets[i].length(); j++) {
                if (alphabets[targets[i].charAt(j) - 'A'] == -1) {
                    ret[i] = -1;                    
                    flag = true;
                    break ;
                }
                dis += alphabets[targets[i].charAt(j) - 'A'];
            }
            if (!flag)
                ret[i] = dis;
        }
        return ret;
    }
}