class Solution {    
    public boolean checkInclusion(String s1, String s2) {
        if (s2.indexOf(s1) != -1) {
            return true;
        } else if (s1.length() > s2.length()) {
            return false;
        }
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        int sum = 0;
        for (char ch : arr) {
            sum += ch;
        }
        int[] sumArr = new int[s2.length()];
        //sumArr[0] = (double)s2.charAt(0);
        for (int i=0; i<s2.length(); i++) {
            sumArr[i] = s2.charAt(i);// + sumArr[i-1];
        }        
        
        if (s2.length() == s1.length()) {
            int num = 0;
            for (int a : sumArr) {
                num += a;
            }
            if (sum == num) {
                char[] check = s2.toCharArray();
                Arrays.sort(check);
                if (Arrays.equals(arr, check)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        
        System.out.println("sum : " + sum);
        for (int i=0; i<s2.length()-s1.length()+1; i++) {
            int count = 0;
            for (int j=0; j<s1.length(); j++) {
                count+=sumArr[j+i];
                //System.out.println("count : " + count);
                //System.out.println("sumArr[j+i] : " + sumArr[j+i]);
                if (count == sum) {
                    //System.out.println("str : " + s2.substring(i, j+i+1));
                    char[] check = s2.substring(i, j+i+1).toCharArray();
                    Arrays.sort(check);
                    if (Arrays.equals(arr, check)) {
                        return true;
                    }
                }
            }
        }
        /*
        for (int i=0; i<s2.length()-s1.length()+1; i++) {
            System.out.println("idx : " + (s1.length()-1+i));
            int temp = sumArr[s1.length()-1+i] - sumArr[i];
            System.out.println("temp : " + temp);
            System.out.println("sumArr[i] : " + sumArr[i]);
            if (temp == sum) {
                System.out.println("str : " + s2.substring(i+1, s1.length()+i+1));
                char[] check = s2.substring(i+1, s1.length()+i+1).toCharArray();
                Arrays.sort(check);
                if (Arrays.equals(arr, check)) {
                    return true;
                }
            }
        }*/
        return false;
    }
}