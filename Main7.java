// Queue-FIFO


import java.util.LinkedList;
// import java.util.PriorityQueue;
import java.util.Queue;
//  import java.util.concurrent.PriorityBlockingQueue;
public class Main7 {
    public static void main(String[] args){
        // Queue <Integer> queue=new PriorityBlockingQueue<>();
        Queue <Integer> queue=new LinkedList<>();  //use only LikedLst
        // Queue <Integer> queue=new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.size());


     }
}
