class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int n = nums.length;
        
        
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return new int[] {-1, -1};
        // int s = 0;
        // int e = n-1;

        // for(int i=0; i<n; i++){
        //     if(nums[s] + nums[e] == target){
        //         return new int[]{s, e};

        //     }else if(nums[s]+nums[e]>target){
        //         s++;
        //     }else{
        //         e--;
        //     }
        // }
        // return new int[]{-1, -1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};

        
        
    }
}