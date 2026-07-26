class Solution {
    public int maximumProduct(int[] nums) {
        //Here -ve numbers are also there so there can be two possible solutions for max product
        // lar*secLar*ThirdLar;
        // (-small)*(-secSmall)*lar;
        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        int thirdLar = Integer.MIN_VALUE;

        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int num : nums){
            if(num >= lar){
                thirdLar = secLar;
                secLar = lar;
                lar = num;
            } else if(num >= secLar){
                thirdLar = secLar;
                secLar = num;
            }else if(num >= thirdLar){
                thirdLar = num;
            }

            if(num <= small){
                secSmall = small;
                small = num;
            } else if(num <= secSmall){
                secSmall = num;
            }
        }
        long result1 = 1L * lar*secLar*thirdLar;
        long result2 = 1L*small*secSmall*lar;
        return (int) Math.max(result1, result2);
    }
}