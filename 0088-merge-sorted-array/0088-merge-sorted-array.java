import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last element in nums1's initial part
        int j = n - 1; // Last element in nums2
        int k = m + n - 1; // Last position in nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining nums2 elements (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
        // Output: [1, 2, 2, 3, 5, 6]
    }
}
