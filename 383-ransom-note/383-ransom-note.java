class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i=0; i<ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) +1);
        }
        System.out.println("map1 : " +map1);
        
        for (int i=0; i<magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) +1);
        }
        System.out.println("map2 : " +map2);
        
        for(Character key : map1.keySet()) {
            int value1 = map1.get(key);
            if (!map2.containsKey(key)) {
                return false;
            }
            int value2 = map2.get(key);
            System.out.println("value1 : " + value1 + " value2 : " + value2);
            if (value1 > value2) {
                return false;
            }
        }
        
        return true;
    }
}