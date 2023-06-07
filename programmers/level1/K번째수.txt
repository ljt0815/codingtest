import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = cutAndSort(array, commands[i][0] - 1, commands[i][1] - 1, commands[i][2] - 1);
        }
        return answer;
    }
    
    int cutAndSort(int[] array, int start, int end, int index) {
        int[] tmp = new int[end - start + 1];
        int tmpIdx = 0;
        for (int i = start ; i <= end; i++) {
            tmp[tmpIdx++] = array[i];
        }
        Arrays.sort(tmp);
        return tmp[index];
    }
}