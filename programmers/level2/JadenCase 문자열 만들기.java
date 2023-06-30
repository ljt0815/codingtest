class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        char first = sb.charAt(0);
        if (first >= 'a' && first <= 'z')
            sb.setCharAt(0, (char)(first - 32));
        for (int i = 1; i < sb.length(); i++) {
            char tmp = sb.charAt(i);
            if (sb.charAt(i - 1) == ' ' && tmp >= 'a' && tmp <= 'z')
                sb.setCharAt(i, (char)(tmp - 32));
        }
        return sb.toString();
    }
}