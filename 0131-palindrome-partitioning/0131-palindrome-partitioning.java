class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

  
        backtrack(0, s, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start, String s, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (isPalindrome(sub)) {
                current.add(sub);
                backtrack(end, s, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--))
                return false;
        }
        return true;
    }
}
