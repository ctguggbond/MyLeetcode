/*
 * @lc app=leetcode id=30 lang=java
 *
 * [30] Substring with Concatenation of All Words
 *
 * https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
 *
 * algorithms
 * Hard (25.39%)
 * Total Accepted:    179.8K
 * Total Submissions: 708.1K
 * Testcase Example:  '"barfoothefoobarman"\n["foo","bar"]'
 *
 * You are given a string, s, and a list of words, words, that are all of the
 * same length. Find all starting indices of substring(s) in s that is a
 * concatenation of each word in words exactly once and without any intervening
 * characters.
 *
 *
 *
 * Example 1:
 *
 *
 * Input:
 * ⁠ s = "barfoothefoobarman",
 * ⁠ words = ["foo","bar"]
 * Output: [0,9]
 * Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar"
 * respectively.
 * The output order does not matter, returning [9,0] is fine too.
 *
 *
 * Example 2:
 *
 *
 * Input:
 * ⁠ s = "wordgoodgoodgoodbestword",
 * ⁠ words = ["word","good","best","word"]
 * Output: []
 *
 *
 */
class Solution {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || words.length == 0 || s.equals("")) {
            return res;
        }
        Map<Integer, Integer> valMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int wordsVal = calcWordVal(words[i]);
            valMap.put(wordsVal, valMap.getOrDefault(wordsVal, 0) + 1);
        }

        int wordsLen = words[0].length();
        int totalLen = words.length * wordsLen;
        for (int i = 0; i <= s.length() - totalLen; i++) {
            boolean r = true;
            Map<Integer, Integer> temp = new HashMap<>();
            for (int j = i; j < i + totalLen; j += wordsLen) {
                int wordsVal = calcWordVal(s.substring(j, j + wordsLen));
                temp.put(wordsVal, temp.getOrDefault(wordsVal, 0) + 1);
                if (temp.get(wordsVal) > valMap.getOrDefault(wordsVal, 0)) {
                    r = false;
                    break;
                }
            }
            if (r) {
                res.add(i);
            }
        }
        return res;
    }

    private static int calcWordVal(String word) {
        return word.hashCode();
    }
}
