class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<moves.length(); i++) {
            char ch = moves.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        if (map.containsKey('U') != map.containsKey('D')) {
            return false;
        } else if (map.get('U') != null && map.get('D') != null) {
            if (!map.get('U').equals(map.get('D'))) {
                return false;
            }
        }
        
        if (map.containsKey('L') != map.containsKey('R')) {
            return false;
        } else if (map.get('L') != null && map.get('R') != null) {
            if (!map.get('L').equals(map.get('R'))) {
                return false;
            }
        }
        
        return true;
    }
}