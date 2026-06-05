class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        int sLength = sChar.length;
        int tLength = tChar.length;

        // if lengths are not equal, cannot be anagram
        if (sLength != tLength) {
            return false;
        }

        boolean[] used = new boolean[tLength];

        for (int i = 0; i < sLength; i++) {

            boolean found = false;

            for (int j = 0; j < tLength; j++) {

                if (sChar[i] == tChar[j] && !used[j]) {
                    used[j] = true; // mark this character as used
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}