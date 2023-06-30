class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            StringBuilder tmp = new StringBuilder(my_string.substring(queries[i][0], queries[i][1] + 1));
            String newString = my_string.substring(0, queries[i][0]) + tmp.reverse() + my_string.substring(queries[i][1] + 1, my_string.length());
            my_string = newString;
        }
        return my_string;
    }
}