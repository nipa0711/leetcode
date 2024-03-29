import java.math.BigInteger;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : deck) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values()); 
        int gcd = list.get(0);
        
        if (list.size() > 1) {
            for (int i=1; i < list.size(); i++) {
                BigInteger b1 = BigInteger.valueOf(list.get(i-1));
                BigInteger b2 = BigInteger.valueOf(list.get(i));
                gcd = Math.min(b1.gcd(b2).intValue(), gcd);
            }            
        }        
        
        if (deck.length % gcd != 0) {
            return false;
        } else if (gcd == 1) {
            return false;
        }
        int idx = 1;
        Arrays.sort(deck);
        int value = deck[0];
        for (int i=1; i<deck.length-1; i++) {
            if (idx == gcd) {
                value = deck[i+1];
                idx = 1;
            } else if (idx < gcd) {
                if (value != deck[i]) {
                    return false;
                }
                idx++;
            }
        }
        
        return true;
    }
}