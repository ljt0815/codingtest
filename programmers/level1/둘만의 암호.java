import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        int[] alphabets = new int[26];
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Arrays.fill(alphabets, 1);
        for (int i = 0; i < skip.length(); i++)
            alphabets[skip.charAt(i) - 'a']--;
        for (int i = 0; i < alphabets.length; i++)
            if (alphabets[i] <= 0)
                continue;
            else
                list.add((char)(i + 'a'));
        for (int i = 0; i < s.length(); i++) {
            sb.append(list.get((list.indexOf(s.charAt(i)) + index) % list.size()));
        }
            
        return sb.toString();
    }
}