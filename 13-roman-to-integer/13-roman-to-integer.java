class Solution {
    public int romanToInt(String s) {
        // IV to A (5)
        // IX to B (9)
        // XL to E (40)
        // XC to F (90)
        // CD to G (400)
        // CM to H (900)
        
        s = s.replace("IV", "A");
        s = s.replace("IX", "B");
        s = s.replace("XL", "E");
        s = s.replace("XC", "F");
        s = s.replace("CD", "G");
        s = s.replace("CM", "H");
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    sum+=1;
                    break;
                case 'V':
                    sum+=5;
                    break;
                case 'X':
                    sum+=10;
                    break;
                case 'L':
                    sum+=50;
                    break;
                case 'C':
                    sum+=100;
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
                case 'A':
                    sum+=4;
                    break;
                case 'B':
                    sum+=9;
                    break;
                case 'E':
                    sum+=40;
                    break;
                case 'F':
                    sum+=90;
                    break;
                case 'G':
                    sum+=400;
                    break;
                case 'H':
                    sum+=900;
                    break;
            }
        }
        System.out.println("sum : " + sum);
        return sum;
    }
}