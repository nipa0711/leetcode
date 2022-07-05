class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double count = 0;
        for (int i=1; i<salary.length-1; i++) {
            count += salary[i];
        }
        return count/(salary.length-2);
    }
}