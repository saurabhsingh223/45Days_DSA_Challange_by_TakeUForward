class Solution {
    public int findGCD(int[] nums) {
        int lar = nums[0];
        int small = nums[0];
        for(int i = 0; i<nums.length; i++){
            lar = Math.max(nums[i], lar);
            small = Math.min(nums[i], small);
        }
        return gcd(lar, small);
    }
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}