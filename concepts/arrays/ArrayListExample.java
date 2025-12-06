package concepts.arrays;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        list.set(0, 2);

        list.remove(1);

        list.contains(2);

        System.out.println(list);

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>(){{
            add(new ArrayList<Integer>());
            add(new ArrayList<Integer>());
            add(new ArrayList<Integer>());
        }};

        System.out.println(list2D);
    }
}