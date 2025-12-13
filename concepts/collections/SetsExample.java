package concepts.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        Set<Integer> original = new HashSet<>(list);
        Set<Integer> n = new HashSet<>();

        for(int i = 1; i <=5;i++){
            n.add(i);
        }
        n.removeAll(original);
        System.out.println(n); //Missing number

        Set<Integer> set1 = new HashSet<>(list);
        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(2);
        System.out.println(set1);
        System.out.println(set2);

        set1.removeAll(set2);

        System.out.println(set1);
        System.out.println(set2);

        //Treeset

        Set<StudentMarks> treeset = new TreeSet<>();
        treeset.add((new StudentMarks(10, 40)));
        treeset.add((new StudentMarks(50, 10)));
        treeset.add((new StudentMarks(70, 30)));
        treeset.add((new StudentMarks(80, 50)));
        treeset.add((new StudentMarks(90, 60)));

        for(StudentMarks x: treeset)
            System.out.println(x + ",");

        NavigableSet<Integer> set3 = new TreeSet<>();
        set3.add(8);
        set3.add(9);
    }
}
