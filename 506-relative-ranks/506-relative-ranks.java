class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> list = new ArrayList<>();
        for (int i : score) {
            list.add(i);
        }
        Collections.sort(list, Comparator.reverseOrder());
        String[] answer = new String[score.length];
        int rank = 1;
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<score.length; j++) {
                if (list.get(i) == score[j]) {
                    if (score[j] == list.get(0)) {
                        answer[j] = "Gold Medal";
                    } else if (score[j] == list.get(1)) {
                        answer[j] = "Silver Medal";
                    } else if (score[j] == list.get(2)) {
                        answer[j] = "Bronze Medal";
                    } else {
                        answer[j] = rank+"";
                    }
                    rank++;
                    break;
                }
            }
        }
        return answer;
    }
}