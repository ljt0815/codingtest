class Solution {
    public String solution(String s, int n) {
        String ret = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ')
                ret += ' ';
            else if (Character.isUpperCase(s.charAt(i))) 
                ret += (char)(((s.charAt(i) - 'A' + n) % 26) + 'A');
            else if (Character.isLowerCase(s.charAt(i)))
                ret += (char)(((s.charAt(i) - 'a' + n) % 26) + 'a');
        }
        return ret;
    }
}