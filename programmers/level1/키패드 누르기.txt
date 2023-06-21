class Solution {
    
    public int[] findIndex(char[][] keypad, int number) {
        for (int i = 0; i < keypad.length; i++)
            for(int j = 0; j < keypad[i].length; j++) {
                if (keypad[i][j] == (char)number + '0')
                    return new int[]{i, j};
            }
        return null;
    }
    
    public String solution(int[] numbers, String hand) {
        char[][] keypad = {
            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'},
            {'*','0','#'}
        };
        Hand left = new Hand(3,0);
        Hand right = new Hand(3,2);
        char[] leftAble = {'1','4','7','*'};
        char[] rightAble = {'3','6','9','#'};
        char[] chooseHand = {'2','5','8','0'};
        String result = "";
        
        for (int i = 0; i < numbers.length; i++) {
            int[] indexs = findIndex(keypad, numbers[i]);
            
            for (int j = 0; j < 4; j++) {
                if (numbers[i]+'0' == leftAble[j]) {
                    left.setPos(indexs[0], indexs[1]);
                    result += 'L';
                }
                else if (numbers[i]+'0' == rightAble[j]) {
                    right.setPos(indexs[0], indexs[1]);
                    result += 'R';
                }
                else if (numbers[i]+'0' == chooseHand[j]) {
                    int dif = right.calc(indexs[0], indexs[1]) - left.calc(indexs[0], indexs[1]);
                    if (dif < 0) {
                        right.setPos(indexs[0], indexs[1]);
                        result += 'R';
                    } else if (dif > 0) {
                        left.setPos(indexs[0], indexs[1]);
                        result += 'L';
                    } else if (dif == 0) {
                        if (hand.equals("right")) {
                            right.setPos(indexs[0], indexs[1]);
                            result += 'R';
                        } else {
                            left.setPos(indexs[0], indexs[1]);
                            result += 'L';
                        }
                    }
                }                   
            }
        }
        return result;
    }
}

class Hand {
    int x;
    int y;
    
    public Hand(int y, int x) {
        this.x = x;
        this.y = y;
    }
    public void setPos(int y, int x) {
        this.x = x;
        this.y = y;
    }
    public int calc(int y, int x) {
        int disY = Math.abs(y - this.y);
        int disX = Math.abs(x - this.x);
        return disY + disX;
    }
}