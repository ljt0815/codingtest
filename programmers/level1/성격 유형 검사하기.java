class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] score = new int[4];
        char[][] resultChar = {
            {'R', 'T'},
            {'C', 'F'},
            {'J', 'M'},
            {'A', 'N'}
        };
        String ret = "";
        
        for (int i = 0; i < survey.length; i++) {
            int[] surveyIndex = getSurveyIndex(survey[i].charAt(0), resultChar);
            int tmp = choices[i] - 4;
            score[surveyIndex[0]] = (surveyIndex[1] == 0) ? score[surveyIndex[0]] - tmp : score[surveyIndex[0]] + tmp;
        }
        for (int i = 0; i < 4; i++) {
            if (score[i] >= 0)
                ret += resultChar[i][0];
            else
                ret += resultChar[i][1];
        }
        return ret;
    }
    
    public int[] getSurveyIndex(char ch, char[][] resultChar) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (ch == resultChar[i][j])
                    return new int[]{i, j};
            }
        }
        return null;
    }
}