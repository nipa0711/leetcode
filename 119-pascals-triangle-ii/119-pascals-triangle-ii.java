class Solution {
    // Ref : https://github.com/nipa0711/leetcode/tree/main/118-pascals-triangle
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rowList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        
        rowList.add(1);
        list.add(rowList);
        if (rowIndex == 0) {
            return list.get(rowIndex);
        }
        rowList = new ArrayList<>();
        rowList.add(1);
        rowList.add(1);
        list.add(rowList);
        if (rowIndex == 1) {
            return list.get(rowIndex);
        }
        for (int i=2; i<=rowIndex; i++) {
            rowList = new ArrayList<>();
            rowList.add(1);
            List<Integer> preList = list.get(i-1);
            for (int j=1; j<preList.size(); j++) {
                int sum = preList.get(j-1) + preList.get(j);
                rowList.add(sum);
            }
            rowList.add(1);
            list.add(rowList);
        }
        return list.get(rowIndex);
    }
}