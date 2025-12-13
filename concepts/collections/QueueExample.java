package concepts.collections;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        //For normal queue we use linked list - FIFO
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

        //Stack - LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);;

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

        //Dequeue
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(1);
        dq.offerFirst(2);
        System.out.println(dq);

        dq.pollLast();

        System.out.println(dq);

        //Priority Queue
        // PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b - a));

        pq.offer(1);
        pq.offer(0);
        pq.offer(2);
        pq.offer(100);

        List<Integer> top2 = new ArrayList<>();

        int index = 0;
        while (!pq.isEmpty()) {
            if(index == 2){
                break;
            }
            top2.add(pq.poll());
            index++;
        }

        System.out.println("--------PQ-------");
        System.out.println(top2);
        System.out.println(pq);

        PriorityQueue<StudentMarks> stpq = new PriorityQueue<>();

        stpq.offer(new StudentMarks(50, 60));
        stpq.offer(new StudentMarks(90, 50));
        stpq.offer(new StudentMarks(100, 44));
        stpq.offer(new StudentMarks(77, 99));

        List<StudentMarks> top2st = new ArrayList<>();

        index = 0;
        while (!stpq.isEmpty()) {
            if(index == 2){
                break;
            }
            top2st.add(stpq.poll());
            index++;
        }

        System.out.println("--------PQ Students-------");
        System.out.println(top2st);
        System.out.println(stpq);
    }
}
