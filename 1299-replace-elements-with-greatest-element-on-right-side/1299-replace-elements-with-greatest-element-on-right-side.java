class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int [] ans = new int[n];
        if(n == 1){
            ans[0] = -1;
            return ans;
        }
        ans[n-1] = -1;
        int max = Integer.MIN_VALUE;
        int last = n-1;
        for(int i = n-2; i>=0; i--){
            ans[i] = Math.max(arr[last], ans[i+1]);
            last--;
        }
        return ans;
    }
}