class Solution {
    public int solution(String[] babbling) {
        String[] able = {"aya", "ye", "woo", "ma"};
        int ret = 0;
        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }
            babbling[i] = babbling[i].replace("aya", " ");
            System.out.println(babbling[i]);
            babbling[i] = babbling[i].replace("ye", " ");
            System.out.println(babbling[i]);
            babbling[i] = babbling[i].replace("woo", " ");
            System.out.println(babbling[i]);
            
            babbling[i] = babbling[i].replace("ma", " ");
            System.out.println(babbling[i]);
            
            babbling[i] = babbling[i].replace(" ", "");
            System.out.println(babbling[i]);
            
            if (babbling[i].isEmpty())
                ret++;
        }
        return ret;
    }
}