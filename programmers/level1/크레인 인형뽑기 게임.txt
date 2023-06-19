import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> st = new Stack<>();
        int ret = 0;
        for (int i = 0; i < moves.length; i++) {
            // j는 위에서부터 내려갈것(세로방향)
            for (int j = 0; j < board.length; j++) {
            // for (int j = board[moves[i] - 1].length - 1; j >= 0 ; j--) {
                if (board[j][moves[i] - 1] != 0) { // moves[i] 값이 인덱스보다 1 크므로 빼주자.
                    System.out.println(board[j][moves[i] - 1]);
                    if (!st.empty() && st.peek() == board[j][moves[i] - 1]) {
                        st.pop();
                        ret+=2;
                    }
                    else
                        st.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break ;   
                }
            }
        }
        return ret;
    }
}