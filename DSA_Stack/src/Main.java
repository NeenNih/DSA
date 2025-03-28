import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.empty());
		
		stack.push("Fuchka");
		stack.push("Biriany");
		stack.push("Kalojam");
		stack.push("Borhany");
		stack.push("Shondesh");
		stack.push("Halim");
		
		System.out.println(stack.empty());
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		System.out.println(stack.search("Biriany"));
		
		System.out.println(stack.search("Noodles"));
		
		for(int i=0; i<10; i++) {
			
			stack.push("Fuchka");
			
		}
		
		
		System.out.println(stack);
		
	}

}
