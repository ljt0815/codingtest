class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int zeroLen = 0;
        int cnt = 0;
        while (sb.length() != 1) {
            cnt++;
            for (int i = 0; i < sb.length(); i++)
                if (sb.charAt(i) == '0') {
                    sb.deleteCharAt(i--);
                    zeroLen++;
                }
            sb = new StringBuilder(Integer.toString(sb.length(), 2));
        }
        
        return new int[] {cnt, zeroLen};
    }
}