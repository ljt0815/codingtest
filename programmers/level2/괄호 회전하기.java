import java.util.*;

class Solution {
    public int solution(String s) {
        List<Character> list = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        int ret = 0;
        
        for (int i = 0; i < s.length(); i++)
            list.add(s.charAt(i));
        
        //n - 1번 회전
        for (int i = 0; i < s.length() - 1; i++) {
            // 괄호문자열 검증
            for (int j = 0; j < list.size(); j++) {
                if (st.isEmpty())
                    st.push(list.get(j));
                else if (st.peek() == '[' && list.get(j) == ']')
                    st.pop();
                else if (st.peek() == '(' && list.get(j) == ')')
                    st.pop();
                else if (st.peek() == '{' && list.get(j) == '}')
                    st.pop();
                else
                    st.push(list.get(j));
            }
            if (st.isEmpty())
                ret++;
            st.clear();
            char tmp = list.get(0);
            list.remove(0);
            list.add(tmp);
        }
        return ret;
    }
}