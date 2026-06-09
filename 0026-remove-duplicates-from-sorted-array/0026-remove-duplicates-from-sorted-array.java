class Solution {
    public int removeDuplicates(int[] nums) {
        // Two pointer approach / Optimal
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;


        // Use this method for unsorted array- O(n) SC
        // Set<Integer> uniqueSet = new HashSet<>();
        // for(int num : nums){
        //         uniqueSet.add(num);
        // }
        // int i = 0;
        // for(int num : uniqueSet){
        //     nums[i++] = num;
        // }
        // return uniqueSet.size();
    }
}