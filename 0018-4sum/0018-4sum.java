class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        // Optimal Approach
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1, right = nums.length - 1;
                while(left < right){
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;

        // Better Approach
        // Set<List<Integer>> set = new HashSet<>();
        // int n = nums.length;
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         Set<Integer> st = new HashSet<>();
        //         for(int k = j+1; k<n; k++){
        //             int req = target - nums[i] - nums[j] - nums[k];
        //             if(st.contains(req)){
        //                 List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], req);
        //                 Collections.sort(list);
        //                 set.add(list);
        //             }
        //             st.add(nums[k]);
        //         }
        //     }
        // }
        // return new ArrayList<>(set);
    }
}