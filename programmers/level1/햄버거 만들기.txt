import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> st = new Stack<>();
        int ret = 0;
        for (int i = 0; i < ingredient.length; i++) {
            st.push(ingredient[i]);
            if (st.size() >= 4 && isAbleBurger(st)) {
                for (int j = 0; j < 4; j++) {
                    st.pop();
                }
                ret++;
            }
        }
        return ret;
    }
    public boolean isAbleBurger(Stack<Integer> st) {
        int[] tmp = new int[4];
        // st 맨 앞의 4개를 확인하기 위한 로직
        for (int i = 0; i < 4; i++)
            tmp[i] = st.pop();
        for (int i = 3; i >= 0; i--)
            st.push(tmp[i]);
        
        // 확인하는 로직
        if (tmp[3] == 1 && tmp[2] == 2 && tmp[1] == 3 && tmp[0] == 1)
            return true;
        return false;
    }
}