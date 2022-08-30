import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String args[]) {

        ArrayList numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }




    }
}
