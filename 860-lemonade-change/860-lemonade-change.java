class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        
        for (int money : bills) {
            switch (money) {
                case 5:
                    map.put(money, map.getOrDefault(money, 0) +1);
                    break;
                case 10:
                    if (map.get(5) <= 0) {
                        return false;
                    }
                    map.put(money, map.getOrDefault(money, 0) +1);
                    map.put(5, map.getOrDefault(5, 0) -1);
                    break;
                case 20:
                    if (map.get(5) <= 0) {
                        return false;
                    }
                    if (map.get(10) <= 0 && map.get(5) <= 0) {
                        return false;
                    } else if (map.get(5)>=3 && map.get(10)==0) {
                        map.put(5, map.getOrDefault(5, 0) -3);
                    } else {
                        map.put(10, map.getOrDefault(10, 0) -1);
                        map.put(5, map.getOrDefault(5, 0) -1);
                    }
                    
                    if (map.get(10) < 0) {
                        return false;
                    } 
                    map.put(money, map.getOrDefault(money, 0) +1);                    
                    break;
            }
        }
        return true;
    }
}