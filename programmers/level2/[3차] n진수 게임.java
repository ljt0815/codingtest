class Solution {
    public String solution(int n, int t, int m, int p) {
        int num = 0;
        int cnt = 0;
        int order = 0;
        StringBuilder sb = new StringBuilder();
        while(true) {
            String str = Integer.toString(num,n);
            for (int i = 0; i < str.length(); i++) {
                if (order % m == p - 1) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                    cnt++;
                    if (cnt == t)
                        return sb.toString();
                }
                order++;
            }
            num++;
        }
            
    }
}