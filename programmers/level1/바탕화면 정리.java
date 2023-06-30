import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        List<File> list = new ArrayList<>();
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#')
                    list.add(new File(i , j));
            }
        }
        return findRectAngle(list);
    }
    public int[] findRectAngle(List<File> list) {
        int minX = 2147483647;
        int minY = 2147483647;
        int maxX = -2147483648;
        int maxY = -2147483648;
        
        for (int i = 0; i < list.size(); i++) {
            File file = list.get(i);
            int[] fileYX= file.getYX();
            if (fileYX[0] < minY)
                minY = fileYX[0];
            if (fileYX[0] > maxY)
                maxY = fileYX[0];
            if (fileYX[1] < minX)
                minX = fileYX[1];
            if (fileYX[1] > maxX)
                maxX = fileYX[1];
        }
        return new int[]{minY, minX, maxY + 1, maxX + 1};
    }
    class File {
        private int x;
        private int y;
        
        File(int y, int x) {
            this.x = x;
            this.y = y;
        }
        
        public int[] getYX(){
            return new int[]{this.y, this.x};
        }
    }
}