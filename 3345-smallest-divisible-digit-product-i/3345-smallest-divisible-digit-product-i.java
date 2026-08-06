class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i = n; i<120; i++){
            if(multiply(i) % t == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
    static int multiply(int n){
        int mul = 1;
        while(n > 0){
            int d = n%10;
            mul = mul * d;
            n /= 10;
        }
        return mul;
    }
}