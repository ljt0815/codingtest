class Solution {
    public int solution(String s) {
        
        String[] alphas = {"zero", "one", "two", "three", "four", "five", "six","seven", "eight", "nine"};
        // String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int ret = 0;
        
        for (int i = 0; i < s.length(); i++) {
            boolean isFind = false;
            for (int j = 0; j < 10; j++) {
                if (i + alphas[j].length() < s.length() + 1)
                    if (myFind(s, alphas[j], i)) {
                        ret = (ret * 10) + j;
                        i += alphas[j].length() - 1;
                        isFind = true;
                    }
            }
            if (!isFind)
                ret = (ret * 10) + (s.charAt(i) - '0');
        }
        return ret;
    }
    
    public boolean myFind(String s1, String s2, int index) {
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(index + i) != s2.charAt(i))
                return false;
        }
        return true;
    }
}