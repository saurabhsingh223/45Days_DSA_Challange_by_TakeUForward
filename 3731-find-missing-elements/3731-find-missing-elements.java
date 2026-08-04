class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        Set<Integer> st = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
            largest = Math.max(largest, nums[i]);
            small = Math.min(small, nums[i]);
        }
        for(int i = small+1; i<largest; i++){
            if(!st.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}