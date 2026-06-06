class Solution {
    public int lengthOfLastWord(String s) {
        String[] l=s.split(" ");
        int len_of_list=l.length;
        return l[len_of_list - 1].length();
        
    }
}