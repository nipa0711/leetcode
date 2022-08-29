class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        for (String word : words) {
            queue.add(word);
        }
        
        while(!queue.isEmpty()) {
            String str = queue.poll();
            for (String word : words) {
                if (str.equals(word)) {
                    continue;
                }
                
                if (word.indexOf(str) != -1) {
                    if (!list.contains(str)) {
                        list.add(str);
                    }                    
                }
            }
        }
        return list;
    }
}