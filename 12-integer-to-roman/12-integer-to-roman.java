class Solution {
    String writeRoman(String letter, int count) {
        String answer = "";
        for (int i=0; i<count; i++) {
            answer += letter;
        }
        return answer;
    }
    
    public String intToRoman(int num) {
        String answer = "";
        do {
            if (num >= 1000) {
                int count = num / 1000;
                answer += writeRoman("M", count);
                num = num - (1000 * count);
            }
            
            if (num >= 100) {
                int count = num / 100;
                if (count >= 5) {
                    if (count == 9) {
                        answer += writeRoman("CM", 1);
                    } else {
                        answer += writeRoman("D", 1);
                        answer += writeRoman("C", count - 5);
                    }
                } else {
                    if (count == 4) {
                        answer += writeRoman("CD", 1);
                    } else {
                        answer += writeRoman("C", count);
                    }
                }
                num = num - (100 * count);
            }
            
            if (num >= 10) {
                int count = num / 10;
                if (count >= 5) {
                    if (count == 9) {
                        answer += writeRoman("XC", 1);
                    } else {
                        answer += writeRoman("L", 1);
                        answer += writeRoman("X", count - 5);
                    }
                } else {
                    if (count == 4) {
                        answer += writeRoman("XL", 1);
                    } else {
                        answer += writeRoman("X", count);
                    }
                }
                num = num - (10 * count);
            }
            
            if (num < 10) {
                int count = num % 10;
                if (count >= 5) {
                    if (count == 9) {
                        answer += writeRoman("IX", 1);
                    } else {
                        answer += writeRoman("V", 1);
                        answer += writeRoman("I", count - 5);
                    }
                } else {
                    if (count == 4) {
                        answer += writeRoman("IV", 1);
                    } else {
                        answer += writeRoman("I", count);
                    }
                }
                num = num - count;
            }
            
        } while (num > 0);
        return answer;
    }
}