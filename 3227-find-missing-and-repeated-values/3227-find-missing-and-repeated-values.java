import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Flatten the matrix and count occurrences
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

        int missing = -1, repeated = -1;

        for (int i = 1; i <= n * n; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) > 1) {
                repeated = i;
            }
        }

        return new int[] { repeated, missing };
    }
}
