class Solution {
    public int[] constructRectangle(int area) {
        int[] answer = new int[2];
        for (int i=1; i<=Math.sqrt(area); i++) {
            int w = i;
            int l = area/w;
            if (w==1) {
                answer[0] = l;
                answer[1] = w;
                continue;
            }
            
            if (!(area%l==0)) {
                continue;
            } else if (w>l) {
                continue;
            }
            int oldDistance = answer[0] - answer[1];
            int currentDistance = l - w;
            if (currentDistance < oldDistance) {
                answer[0] = l;
                answer[1] = w;
            }
            
        }
        return answer;
    }
}