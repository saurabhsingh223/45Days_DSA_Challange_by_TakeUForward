class Solution {
    public int maxDigitRange(int[] nums) {
        int [] arr = new int[nums.length];
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            arr[i] = digitRange(nums[i]);
            max = Math.max(max, arr[i]);
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == max){
                sum += nums[i];
            }
        }
        return sum;
    }
    static int digitRange(int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n > 0){
            int digit = n % 10;
            max = Math.max(max, digit);
            min = Math.min(min, digit);
            n = n/10;
        }
        return max-min;
    }
}