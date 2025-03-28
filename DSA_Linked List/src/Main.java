import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//LinkedList as a stack
		
		/*
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		System.out.println(linkedList);
		linkedList.pop();
		System.out.println(linkedList);*/
		
		
		//LinkedList as a queue
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		System.out.println(linkedList);
		linkedList.poll();
		System.out.println(linkedList);
		
		linkedList.add(3,"E");
		System.out.println(linkedList);
		linkedList.remove("E");
		System.out.println(linkedList);
		
		
		System.out.println(linkedList.indexOf("D"));
		System.out.println(linkedList.indexOf("d"));
		
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		
		
		linkedList.addFirst("A");
		linkedList.addLast("G");
		System.out.println(linkedList);
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);
		
	}

}
