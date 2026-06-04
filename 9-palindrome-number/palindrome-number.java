class Solution {
    public boolean isPalindrome(int x) {

        String ns = "";
        String s = String.valueOf(x);

        for(int i = s.length() - 1; i >= 0; i--) {
            ns = ns + s.charAt(i);
        }

        return s.equals(ns);
    }
}