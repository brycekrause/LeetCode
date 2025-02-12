class Solution {
    public boolean isPalindrome(int x) {
        String s = "racecar", palindrome = "";
        for (int i = s.length()-1; i >= 0; i--){ palindrome += s.charAt(i); }
        if (s.equalsIgnoreCase(palindrome)) { return true; } else { return false; }
    }
}