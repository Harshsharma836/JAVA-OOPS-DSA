package JavaProgramss;

import java.util.ArrayList;

public class RecursionSubsetsSubsequence {
    public static void main(String[] args) {
        String value = "abaccappleaeappled";
        // String ans = removeA(value , "" , 0);
//        String ans = removeADirect(value , 0);

        String ans = skipApple(value); // function to skip word in this we skip a work "apple"
        System.out.println(ans);


    }
    // Skip a world in this we skip "apple"
    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            char ch = up.charAt(0);
            return  ch + skipApple(up.substring(1));
        }
    }

    // Skip "a" char in String in 1 way
    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }

    // Skip "a" char in String in 2 way
    public static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a' ){
            skip(p , up.substring(1));
        }
        else{
            skip(p+ch , up.substring(1));
        }
    }

    // Skip "a" char in String in 3 way
    public static String removeA(String a , String ans , int index){
        if(index == a.length()) return ans;
        if((""+a.charAt(index)).equals("a") == false ) {
            ans += a.charAt(index);
        }
        return removeA(a, ans, index+1);
    }

    // Skip "a" char in String in 4 way
    public static String removeADirect(String a , int index){ // baccad
        if(index == a.length()){
            return "";
        }
        else{
            if((""+a.charAt(index)).equals("a") == false){
                return a.charAt(index)+ removeADirect(a, index+1);
            }
            return removeADirect(a, index+1);
        }
    }
}
