import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer("C");
		queue.offer("E");
		queue.offer("A");
		queue.offer("D");
		queue.offer("B");
		
		queue.offer("1");
		queue.offer("3");
		queue.offer("5");
		queue.offer("4");
		queue.offer("2");
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue.poll());
			
		}
		
	}

}
