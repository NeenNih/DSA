import java.util.Queue;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		

		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue);
		
		System.out.println(queue.isEmpty());
		
		queue.offer("Red");
		queue.offer("Blue");
		queue.offer("Green");
		queue.offer("Yellow");
		
		System.out.println(queue.isEmpty());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());   
		
		System.out.println(queue);
		
		queue.poll();
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.size());
		
		System.out.println(queue.contains("Green"));
		
	}

}
