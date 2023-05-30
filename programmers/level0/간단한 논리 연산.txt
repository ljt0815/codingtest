class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean y1 = false;
        boolean y2 = false;
        if (x1 || x2)
            y1 = true;
        if (x3 || x4)
            y2 = true;
        return y1 && y2;
    }
}