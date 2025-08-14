class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];

        // Compute prefix sums
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        // Monotonic stack to find left and right bounds
        int[] left = new int[n];
        int[] right = new int[n];

        // Left boundary: previous smaller element
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        // Right boundary: next smaller element
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - 1 : stack.peek() - 1;
            stack.push(i);
        }

        // Calculate max min-product
        long maxProduct = 0;
        for (int i = 0; i < n; i++) {
            long sum = prefixSum[right[i] + 1] - prefixSum[left[i]];
            maxProduct = Math.max(maxProduct, sum * nums[i]);
        }

        return (int) (maxProduct % 1_000_000_007);
    }

}