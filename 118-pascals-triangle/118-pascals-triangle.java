class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> rowList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        
        rowList.add(1);
        list.add(rowList);
        if (numRows == 1) {
            return list;
        }
        rowList = new ArrayList<>();
        rowList.add(1);
        rowList.add(1);
        list.add(rowList);
        if (numRows == 2) {
            return list;
        }
        for (int i=2; i<numRows; i++) {
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
        
        return list;
    }
}