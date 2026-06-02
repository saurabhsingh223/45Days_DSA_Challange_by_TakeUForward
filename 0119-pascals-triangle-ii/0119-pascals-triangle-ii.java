class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long ans = 1;
        row.add((int)ans);
        for(int i = 0; i<rowIndex; i++){
            ans = ans*(rowIndex-i)/(i+1);
            row.add((int)ans);
        }
        return row;
    }
}