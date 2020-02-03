package leetCode;

import java.util.HashSet;

public class LeetCode {

    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + length + 1; j < s.length(); j++) {
                if (isRight(s, i, j)) {
                    length = j - i;
                }
            }
        }
        return length;
    }

    private boolean isRight(String s, int i, int j) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int k = i; k < j; k++) {
            if (hashSet.contains(s.charAt(k))) return false;
            hashSet.add(s.charAt(k));
        }
        return true;
    }
}
