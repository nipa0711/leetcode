class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] spokenPeople = new boolean[n + 1];
        int[] trustedPeople = new int[n + 1];
        
        for (int[] temp : trust) {
            spokenPeople[temp[0]] = true;
            trustedPeople[temp[1]]++;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<spokenPeople.length; i++) {
            if (!spokenPeople[i]) {
                list.add(i);
            }
        }
        if (list.size() != 1) {
            return -1;
        }
        
        if (trustedPeople[list.get(0)] == n-1) {
            return list.get(0);
        } 
        return -1;
    }
}