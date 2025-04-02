

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add a copy of the current subset

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]); // Include current number
            backtrack(i + 1, nums, current, result); // Recursive call for the next element
            current.remove(current.size() - 1); // Backtrack: Remove last added element
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = { 1, 2, 3 };
        System.out.println(sol.subsets(nums1));
        // Output: [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]]

        int[] nums2 = { 0 };
        System.out.println(sol.subsets(nums2));
        // Output: [[], [0]]
    }
}
