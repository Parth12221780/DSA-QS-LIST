import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a valid combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (target >= candidates[i]) { // Only proceed if the number is ≤ remaining target
                current.add(candidates[i]); // Choose the number
                backtrack(i, candidates, target - candidates[i], current, result); // Recursive call
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }
}
