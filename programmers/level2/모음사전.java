class Solution {
    int ret = 0;
    int cnt = 0;
    boolean flag = false;
    char[] ch = {'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        StringBuilder sb = new StringBuilder();
        dfs(sb, word);
        return ret;
    }
    public void dfs(StringBuilder sb, String word) {
        if (flag == true)
            return ;
        if (word.equals(sb.toString())) {
            ret = cnt;
            flag = true;
        }
        if (sb.length() > 4) return ;
        for (int i = 0; i< ch.length; i++) {
            sb.append(ch[i]);
            cnt++;
            dfs(sb, word);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}