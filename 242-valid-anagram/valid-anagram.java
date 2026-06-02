class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ns=s.toCharArray();
        char[] nt=t.toCharArray();
        Arrays.sort(ns);
        Arrays.sort(nt);
        if(ns.length==nt.length){
            for(int i=0;i<ns.length;i++){
                if(ns[i]!= nt[i]){
                    return false;
                }
            }
            return true;
        }
        return false;


        
    }
}