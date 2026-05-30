import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        boolean res= false;
        String st="";
        String ost="";
        for(int i=0;i<s.length();i++){
            char ad=s.charAt(i);
            if(Character.isLetterOrDigit(ad)){
                ost=ost+Character.toLowerCase(ad);                
            }
        }

        for(int i=s.length()-1;i>=0;i--){
            char ad=s.charAt(i);
            if(Character.isLetterOrDigit(ad)){
                st=st+Character.toLowerCase(ad);                
            }
        }
        if(ost.equals(st)){
            res= true;
        }
        return res;
    }
    
}