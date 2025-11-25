// Last updated: 11/25/2025, 9:32:14 AM
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) { // allow letters and digits
                arr.add(Character.toLowerCase(ch));
            }
        }

        ArrayList<Character> reversed = new ArrayList<>(arr);
        Collections.reverse(reversed);

        return arr.equals(reversed);
    }
}