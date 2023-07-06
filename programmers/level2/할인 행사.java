import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < discount.length; i++)
            sb.append(getIdx(want, discount[i]));
        for (int n : number)
            list.add(n);
        int cnt = 0;          
        
        for (int i = 0; i < sb.length() - 9; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < list.size(); j++)
                tmp.add(list.get(j));
            int j = 0;
            while (j < 10 && sb.charAt(i + j) >= '0' && sb.charAt(i + j) <= '9' && tmp.get(sb.charAt(i + j) - '0') > 0) {
                int ttmp = tmp.get(sb.charAt(i + j) - '0') - 1;
                tmp.set(sb.charAt(i + j) - '0', ttmp);
                j++;
            }
            int k = 0;
            if (j == 10) {
                for (k = 0; k < tmp.size(); k++) {
                    if (tmp.get(k) != 0)
                        break ;
                }
                if (k == tmp.size())
                    cnt++;
            }
        }
        return cnt;
    }
    
    char getIdx(String[] want, String name) {
        for (int i = 0; i < want.length; i++) {
            if (name.equals(want[i]))
                return (char)(i + '0');
        }
        return '?';
    }
}