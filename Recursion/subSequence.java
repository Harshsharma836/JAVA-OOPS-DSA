package JavaProgramss;

import java.util.ArrayList;
import java.util.List;

public class subSequence {
    public static void main(String[] args) {
        System.out.println(subSeq("", "abc"));;
    }
    public static ArrayList<String> subSeq(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; // this light will go into an left or right depend on
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p+ch , up.substring(1));
        ArrayList<String> right = subSeq(p , up.substring(1));
        left.addAll(right);
        return left;
    }

}
