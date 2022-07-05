class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int pre = 0;
        int planted = 0;
        for (int i=0; i<flowerbed.length; i++) {            
            int next = i == flowerbed.length -1 ? 0 : flowerbed[i+1];
            if (pre == 0 && flowerbed[i] == 0 && next == 0) {
                flowerbed[i] = 1;
                planted++;
                if (planted == n) {
                    return true;
                }
            }
            pre = flowerbed[i];
        }
        return false;
    }
}