class Solution {
    public String solution(int[] food) {
        String s = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                s += (char)(i + '0');
            }
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = s + '0' + sb.toString();
        return s;
    }
}