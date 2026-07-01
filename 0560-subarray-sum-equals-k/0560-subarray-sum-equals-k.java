class Solution {
    public int subarraySum(int[] nums, int k) {

        // PrefixSum + Hashing(Optimal)
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i<nums.length; i++){
            prefixSum += nums[i];
            int rem = prefixSum - k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}