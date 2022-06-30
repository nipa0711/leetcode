class Solution {
    public String addStrings(String num1, String num2) {
        int max = Math.max(num1.length(), num2.length());
        int min = Math.min(num1.length(), num2.length());
        int which = num1.length() > num2.length() ? 2 : 1;
        if (num1.length() == num2.length()) {
            which = 0;
        }
        
        if (which == 1) {
            String temp = "";
            for (int i=0; i<max-min; i++) {
                temp += "0";
            }
            num1 = temp + num1;
        } else if (which == 2) {
            String temp = "";
            for (int i=0; i<max-min; i++) {
                temp += "0";
            }
            num2 = temp + num2;
        }
        
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        
        boolean needUp = false;
        String answer = "";
        
        for (int i = 0; i<num1.length(); i++) {
            char ch1 = arr1[num1.length()-1-i];
            char ch2 = arr2[num2.length()-1-i];
            int a = ch1 - '0';
            int b = ch2 - '0';
            int sum = a+b;
            if (needUp) {
                sum++;
            }
            
            if (sum>=10) {
                needUp = true;                
            } else {
                needUp = false;
            }
            answer += sum % 10;
        }
        
        if (needUp) {
            answer += "1";
        }
        
        StringBuffer sb = new StringBuffer(answer);
        return sb.reverse().toString();
    }
}