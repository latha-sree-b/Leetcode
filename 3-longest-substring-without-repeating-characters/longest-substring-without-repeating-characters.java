public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Array to store the last seen index of each ASCII character
        int[] lastSeen = new int[128];
        // Initialize all positions with -1 (not seen yet)
        java.util.Arrays.fill(lastSeen, -1);

        int maxLength = 0;
        int left = 0; // Left boundary of the sliding window

        // Loop through the string with the right boundary 'right'
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character was seen before, and its index falls inside 
            // the current window, jump the left boundary right past it
            if (lastSeen[currentChar] >= left) {
                left = lastSeen[currentChar] + 1;
            }

            // Update or record the latest index of the character
            lastSeen[currentChar] = right;

            // Calculate the window size and update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
            }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // Output: 3 ("abc")
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // Output: 1 ("b")
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // Output: 3 ("wke")
    }
}
