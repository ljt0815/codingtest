import java.util.*;
class Solution {
    public String solution(String new_id) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < new_id.length(); i++) {
            list.add(new_id.charAt(i));
        }
        // 1단계
        for (int i = 0; i < list.size(); i++) {
            char tmp = list.get(i);
            if (Character.isUpperCase(tmp))
                list.set(i, (char)(tmp + 32));
        }
        // 2단계
        for (int i = 0; i < list.size(); i++) {
            char tmp = list.get(i);
            if (!(Character.isLetter(tmp) || Character.isDigit(tmp) || 
                  tmp == '-' || tmp == '_' || tmp == '.'))
                list.remove(i--);
        }
        // 3단계
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            char now = list.get(i);
            if (flag && now == '.')
                list.remove(i--);
            else if (now == '.')
                flag = true;
            else
                flag = false;
        }
        // 4단계
        if (list.size() > 0 && list.get(0) == '.')
            list.remove(0);
        if (list.size() > 0 && list.get(list.size() - 1) == '.')
            list.remove(list.size() - 1);
        // 5단계
        if (list.size() == 0)
            list.add('a');
        // 6단계
        if (list.size() >= 16) {
            for (int i = 15; i < list.size(); i++) {
                list.remove(i--);
            }
            if (list.get(14) == '.')
                list.remove(14);
        }
        // 7단계
        if (list.size() == 1)
            for (int i = 0; i < 2; i++)
                list.add(list.get(0));
        
        if (list.size() == 2)
            list.add(list.get(1));

        // 반환하기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}