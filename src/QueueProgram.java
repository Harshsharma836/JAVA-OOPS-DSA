import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        a.add(32);
        a.add(21);
        a.add(34);
        a.add(54);
        a.add(14);

//        Iterator value = a.iterator();
//        while (value.hasNext()){
//            System.out.println(value.next());
//        }

        Integer [] arr = a.toArray(new Integer[a.size()]);
        System.out.println(Arrays.toString(arr));

    }
}
