
public class Main {

	public static void main(String[] args) {
		
		
		int[] array = {1, 2, 4, 8, 16, 32, 64, 124, 256, 512, 1024};
		
		int index = interpolationSearch(array, 64);
		
		if(index == -1) {
			
			System.out.println("Element not found.");
			
		}
		else {
			
			System.out.println("Element is found at index: " + index);
			
		}
		
	}

	private static int interpolationSearch(int[] array, int value) {
		
		int high = array.length - 1;
		
		int low = 0;
		
		while(value >= array[low] && value <= array[high] && low <= high) {
			
			int probe = low +  (high - low) * (value - array[low]) / (array[high] - array[low]);
			
			System.out.println("probe: " + probe);
			
			if(array[probe] > value) { high = probe - 1; }
			
			else if(array[probe] < value) { low = probe + 1; }
			
			else { return probe; }
					
		}
		
		return -1;
	}

}
