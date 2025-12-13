package concepts.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,6};
        List<Integer> al = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        Integer ar[] = new Integer[] {1,2,2,3};
        List<Integer> lst = Arrays.asList(ar);
    }
}
