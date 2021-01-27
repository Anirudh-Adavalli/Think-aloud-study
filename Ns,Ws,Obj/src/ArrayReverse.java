
// Array reverse

public class ArrayReverse {
	
	  static int[] reverseNumberArray(int numbers[]) { 
			int length = numbers.length;
			int temp; 
			for (int i = 0; i < length / 2; i++) { 
				temp = numbers[i]; 
				numbers[i] = numbers[length - i - 1]; 
				numbers[length - i - 1] = temp; 
			}
			return numbers;
		}

	public static void main(String[] args) {
		int array[] = {23,37,26,43, 68};
		int reversedArray[] = reverseNumberArray(array);
		for(int k = 0; k <= reversedArray.length - 1; k++) {
        	System.out.println(reversedArray[k]);
        }
	}	
}




