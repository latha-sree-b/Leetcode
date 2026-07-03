class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. Edge case: if the array is null or empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // 2. Loop through every character index of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            
            // 3. Compare this character with the character at index i in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If the current string is shorter than index i, OR
                // if the characters don't match, the common prefix ends here
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // 4. If the loop completes, the entire first string is the common prefix
        return strs[0];
    }
}
