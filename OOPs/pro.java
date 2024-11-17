import java.util.ArrayList;

public class pro {
    public static void main(String[] args) {
        String temp = "harsh";
        String tempTwo = "asdsa";
        String checkTwo = "";
        for(int i=tempTwo.length()-1 ; i >= 0 ; i--){
            checkTwo += tempTwo.charAt(i);
        }
        System.out.println( tempTwo.equals(checkTwo));
    }
}
