class Solution {
    public String solution(String s) {
        String rtn = "";
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                flag = true;
                rtn += ' ';
                continue;
            }
            if (!flag)
                rtn += Character.toLowerCase((char)s.charAt(i));
            else 
                rtn += Character.toUpperCase((char)s.charAt(i));
            flag = !flag;
        }
        return rtn;
    }
}