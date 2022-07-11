class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double xIncreased = coordinates[1][0] - coordinates[0][0];
        double yIncreased = coordinates[1][1] - coordinates[0][1];    

        for (int i=1; i<coordinates.length; i++) {            
            if (xIncreased == 0) {
                if (coordinates[i][0] != coordinates[1][0]) {
                    return false;
                }
            } else if (yIncreased == 0) {
                if (coordinates[i][1] != coordinates[1][1]) {
                    return false;
                }
            }
            
            if (xIncreased!=0) {
                double a = (yIncreased/xIncreased);
                double b = coordinates[0][1] - (a * coordinates[0][0]);
                if (coordinates[i][1] != a * coordinates[i][0] + b) {
                    return false;
                }
            }            
        }
        return true;
    }
}