import java.util.*;
class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            String myStr = "";
            int targetLen = 1;
            int anotherLen = 0;
            int j = i + 1;
            myStr += (char)s.charAt(i);
            while (j < s.length() && targetLen != anotherLen) {
                if (s.charAt(j) == target)
                    targetLen++;
                else if (s.charAt(j) != target)
                    anotherLen++;
                myStr += (char)s.charAt(j++);
            }
            i = j - 1;
            list.add(myStr);
        }
        return list.size();
    }
}