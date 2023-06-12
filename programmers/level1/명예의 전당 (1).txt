public int[] solution(int k, int[] score) {
        List<Integer> hornor = new ArrayList<>();
        int[] ret = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            hornor.add(score[i]);
            Collections.sort(hornor);
            if (hornor.size() == k + 1)
                hornor.remove(0);
            ret[i] = Collections.min(hornor);
        }
        return ret;
    }