// Linear search is for unsorted array.
public class Main {

	public static void main(String[] args) {
		
		int[] array = {9, 13, 4, 68, 23, 156, 32, 41, 80};
		
		int index = linearSearch(array, 32);
		
		if(index != -1) {
			
			System.out.println("Element found at index: " + index);
			
		}
		else {
			
			System.out.println("Element not found");
			
		}
		

	}
	
	public static int linearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == value) {
				
				return i;
			}
		}
		
		return -1;
		
	}

}
