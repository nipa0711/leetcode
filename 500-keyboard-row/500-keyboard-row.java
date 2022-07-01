class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        
        List<String> rows = new ArrayList<>();
        rows.add(first);
        rows.add(second);
        rows.add(third);
        
        Map<Character, Integer> map = new HashMap<>();
        
        int index = 1;
        for (String row : rows) {
            char[] keys = row.toCharArray();
            for (char ch : keys) {
                map.put(ch, index);
            }
            index++;
        }
        
        
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int keyCode = 0;
            boolean check = true;
            for (int i=0; i<word.length(); i++) {
                char ch = word.toLowerCase().charAt(i);
                if (i == 0) {
                    keyCode = map.get(ch);
                } else if (keyCode != map.get(ch)) {
                    check = false;
                    break;
                }    
            }
            if (check) {
                list.add(word);
            }
        }
        
        return list.toArray(new String[0]);
        
    }
}