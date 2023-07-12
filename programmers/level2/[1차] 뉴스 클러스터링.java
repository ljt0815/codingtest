import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> str1Slice = new ArrayList<>();
        List<String> str2Slice = new ArrayList<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            if (!Character.isAlphabetic(str1.charAt(i)) || !Character.isAlphabetic(str1.charAt(i + 1)))
                continue ;
            str1Slice.add(str1.substring(i, i + 2).toLowerCase());
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (!Character.isAlphabetic(str2.charAt(i)) || !Character.isAlphabetic(str2.charAt(i + 1)))
                continue ;
            str2Slice.add(str2.substring(i, i + 2).toLowerCase());
        }
        int inter = 0;
        for (int i = 0; i < str1Slice.size(); i++) {
            for (int j = 0; j < str2Slice.size(); j++) {
                if (str1Slice.get(i).equals(str2Slice.get(j))) {
                    str1Slice.remove(i--);
                    str2Slice.remove(j);
                    inter++;
                    break ;
                }
            }
        }
        int union = inter + str1Slice.size() + str2Slice.size();
        if (str1Slice.size() + str2Slice.size() == 0)
            return 65536;
        return (int)((double)65536 * ((double)inter / union));
    }
}