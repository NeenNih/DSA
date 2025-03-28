public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("factorial: "  + factorial(5));
		System.out.println("fibonacci: " + fibonacci(0, 1));
	}
	
	private static int factorial(int num) {
		
	    if (num < 1) {
	    	
	    	return 1;
	    	
	    }
	    
	    return num * factorial(num - 1); 
	    
	}

	private static int fibonacci(int m, int n) {
		
	    int sum = m + n;
	    
	    m = n;
	    n = sum;
	    
	    if (sum < 200) return fibonacci(m, n); 
	    
	    return sum;
		
	}
	
}



