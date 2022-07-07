class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = 10000;
        int saved = -1;
        int idx = -1;
        for (int[] point : points) {
            idx++;
            int a = point[0];
            int b = point[1];
            if (a != x && b != y) {
                continue;
            }
            int distance = Math.abs(a-x) + Math.abs(b-y);
            if (distance == 0) {
                return idx;
            } else if (distance < min) {
                min = distance;
                saved = idx;
            }
        }
        return saved;
    }
}