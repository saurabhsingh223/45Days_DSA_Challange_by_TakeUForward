class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 1; i<=numRows; i++){
            triangle.add(addRow(i));
        }
        return triangle;

    }

    public List<Integer> addRow(int n){
        List<Integer> ans = new ArrayList<>();
        int res = 1;
        ans.add(res);
        for(int i = 1; i<n; i++){
            res = res*(n-i) / i;
            ans.add(res);
        }
        return ans;
    }
        //     // Brute Force Solution
        //     List<List<Integer>> triangle = new ArrayList<>();
        //     for(int i = 0; i<numRows; i++){
        //         List<Integer> list = new ArrayList<>();
        //         for(int j = 0; j<=i; j++){
        //             list.add(nCr(i,j));
        //         }
        //         triangle.add(list);
        //     }
        //     return triangle;
        // }
        // public int nCr(int n, int r){
        //     long result = 1;
        //     for(int i = 0; i<r; i++){
        //         result = result*(n-i);
        //         result = result/(i+1);
        //     }
        //     return (int) result;
}