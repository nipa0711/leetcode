class Solution {
    public boolean judgeCircle(String moves) {
        int udNum = 0;
        int lrNum = 0;
        for (int i=0; i<moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    udNum++;
                    break;
                case 'D':
                    udNum--;
                    break;
                case 'L':
                    lrNum++;
                    break;
                case 'R':
                    lrNum--;
                    break;
            }
        }
        
        return udNum == 0 && lrNum == 0;
    }
}