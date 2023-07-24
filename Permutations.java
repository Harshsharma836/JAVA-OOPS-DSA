package JavaProgramss;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> ans =  premutations("", "abc");
        System.out.println(ans);
    }
    public static ArrayList<String> premutations(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0); // a
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0 ; i<=p.length() ; i++){
             String f = p.substring(0,i);  //
             String s = p.substring(i,p.length());
             ans.addAll(premutations(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
