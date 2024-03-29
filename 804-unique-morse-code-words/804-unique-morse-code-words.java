class Solution {
    Map<Character, String> map = new HashMap<>() {
        {
            put('a', ".-");
            put('b', "-...");
            put('c', "-.-.");
            put('d', "-..");
            put('e', ".");
            put('f', "..-.");
            put('g', "--.");
            put('h', "....");
            put('i', "..");
            put('j', ".---");
            put('k', "-.-");
            put('l', ".-..");
            put('m', "--");
            put('n', "-.");
            put('o', "---");
            put('p', ".--.");
            put('q', "--.-");
            put('r', ".-.");
            put('s', "...");
            put('t', "-");
            put('u', "..-");
            put('v', "...-");
            put('w', ".--");
            put('x', "-..-");
            put('y', "-.--");
            put('z', "--..");
        }
    };
    public int uniqueMorseRepresentations(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<word.length(); i++) {
                sb.append(map.get(word.charAt(i)));
            }
            if (!list.contains(sb.toString())) {
                list.add(sb.toString());
            }            
        }
        return list.size();
    }
}