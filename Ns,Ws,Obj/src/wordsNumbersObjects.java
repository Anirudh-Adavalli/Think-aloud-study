import java.util.Arrays;
import java.math.*;


public class wordsNumbersObjects {
	
	// Numbers 
	
	// Calculate Average
	
	public float arrayAverage(int[] array) {
		int counter = 0;
		int sum = 0;

		while (counter < array.length) {
			sum = sum + array[counter];
			counter = counter + 1;
		}

		float average = sum / (float) counter;
		return average;
	}
	
	//Check if values are within a threshold 
	
	public int checkConfines(int[] array, int lowerBound, int upperBound) {
		int counter = 0;

		while (counter < array.length) {
			
			if(array[counter] < lowerBound || array[counter] > upperBound){
				return counter;
			}
			
			counter = counter + 1;
		}

		return -1;
	}
	
	//Closest to a given value
	
	public int findClosest(int[] array, int searchValue) {
		
		int counter = 0;
		int closest = 0;
		
		while (counter < array.length) {
			
			int currentClosest = searchValue - array[counter];
			currentClosest = Math.abs(currentClosest);
			
			if(currentClosest == 0){
				return counter;
			}
			
			if(closest == 0 || currentClosest < closest){
				closest = currentClosest;
			}
			
			counter = counter + 1;
		}

		return closest;
	}
	



	// Reverse an array
	
	 public static int[] reverseNumberArray(int numbers[]) { 
			int length = numbers.length;
			int temp; 
			for (int i = 0; i < length / 2; i++) { 
				temp = numbers[i]; 
				numbers[i] = numbers[length - i - 1]; 
				numbers[length - i - 1] = temp; 
			}
			return numbers;
		}
	 
	 
	 // Remove duplicate element from an array
	 
	 public static int[] removeDuplicateNumber(int arr[]) {
			Arrays.sort(arr);
			int length = arr.length;
			int[] result = new int[length];
			int j = 0;
			for (int i = 0; i < length - 1; i++){
				if (arr[i] != arr[i + 1]){
					result[j] = arr[i];
					j = j + 1;
				}
			}
			result[j] = arr[length - 1];

			return result;
		}

	 
	// Words
	 
    // Count average number of characters
	 
	 public float arrayAverage(String[] array) {
	 	int counter = 0;
	 	int sum = 0;

	 	while (counter < array.length) {
	 		sum = sum + array[counter].length();
	 		counter = counter + 1;
	 	}

	 	float average = sum / (float) counter;
	 	return average;
	 }
	 
	 // Check word length 
	 
	 public int checkConfines(String[] array, int lowerBound, int upperBound) {
			int counter = 0;

			while (counter < array.length) {
				
				if(array[counter].length() < lowerBound || array[counter].length() > upperBound){
					return counter;
				}
				
				counter = counter + 1;
			}

			return 0;
		}
	 
	 // Find closest
	 
	 public int findClosest(String[] array, int searchValue) {
			
			int counter = 0;
			int closest = 0;
			
			while (counter < array.length) {
				
				int currentClosest = searchValue - array[counter].length();
				currentClosest = Math.abs(currentClosest);
				
				if(currentClosest == 0){
					return counter;
				}
				
				if(closest == 0 || currentClosest < closest){
					closest = currentClosest;
				}
				
				counter = counter + 1;
			}

			return closest;
		}
	 
	 // Reverse a word
	 
	 public static String[] reverseWordArray(String words[]) { 
			int length = words.length;
			String temp;
			for (int i = 0; i < length / 2; i++) { 
				temp = words[i]; 
				words[i] = words[length  - i - 1];
				words[length - i - 1] = temp;
			}
			return words;
		}
	 
	 
	 // Remove duplicates
	 
	 public static String[] removeDuplicateWords(String words[]) {
			Arrays.sort(words);
			int length = words.length;
			String[] result = new String[length];
			int j = 0;
			for (int i = 0; i < length - 1; i++){
				if (words[i] != words[i + 1]){
					result[j] = words[i];
					j = j + 1;
				}
			}
			result[j] = words[length - 1];

			return result;
		}
	 
	 // abstract object
	 
	 // Average
	 
	 public float arrayAverage(Sound[] array) {
			int counter = 0;
			int sum = 0;

			while (counter < array.length) {
				sum = sum + array[counter].frequencyInHertz;
				counter = counter + 1;
			}

			float average = sum / (float) counter;
			return average;
		}
	 
	 //check if values are within a threshold 
	 
	 public int checkConfines(Liquid[] array, float lowerBound, float upperBound) {
			int counter = 0;

			while (counter < array.length) {
				
				if(array[counter].density < lowerBound || array[counter].density > upperBound){
					return counter;
				}
				
				counter = counter + 1;
			}

			return 0;
		}
	 
	 // Find a value in an array that is the closest to a given value.
	 
	 public int findClosest(Movement[] array, float searchValue) {
			
			int counter = 0;
			int closest = 0;
			
			while (counter < array.length) {
				
				int currentClosest = (int) (searchValue - array[counter].velocity);
				currentClosest = Math.abs(currentClosest);
				
				if(currentClosest == 0){
					return counter;
				}
				
				if(closest == 0 || currentClosest < closest){
					closest = currentClosest;
				}
				
				counter = counter + 1;
			}

			return closest;
		}
	 
	 // reverse an array
	 
	 public static Rotation[] reverseArray(Rotation array[]) { 
			int length = array.length;
			Rotation temp; 
			for (int i = 0; i < length / 2; i++) { 
				temp = array[i]; 
				array[i] = array[length - i - 1]; 
				array[length - i - 1] = temp; 
			}
			return array;
		}
	 
	 // remove duplicate element from an array
	 
	 public static float[] removeDuplicate(Light array[]) {
			
			float[] values = new float[array.length];
			for(int i = 0; i < array.length; i++) {
				values[i] = array[i].illuminance;
			}	
			Arrays.sort(values);
			
			int length = values.length;
			float[] result = new float[length];
			
			int j = 0;
			for (int i = 0; i < length - 1; i++){
				if (values[i] != values[i + 1]){
					result[j] = values[i];
					j = j + 1;
				}
			}
			result[j] = values[length - 1];

			return result;
		}
	 
	 // Concrete Objects
	 
	// algorithm 1: calculate average
	 
	 public float arrayAverage(BicycleWheel[] array) {
			int counter = 0;
			float sum = 0;

			while (counter < array.length) {
				sum = sum + array[counter].radiusInInch;
				counter = counter + 1;
			}

			float average = sum / (float) counter;
			return average;
		}
	 
	// algorithm 2: check if values are within a threshold 
	 
	 public int checkConfines(Tree[] array, float lowerBound, float upperBound) {
			int counter = 0;

			while (counter < array.length) {
				
				if(array[counter].height < lowerBound || array[counter].height > upperBound){
					return counter;
				}
				
				counter = counter + 1;
			}

			return 0;
		}
	 
	// algorithm 3: find a value in an array that is the closest to a given value
	 
	 public int findClosest(Student[] array, int searchValue) {
			
			int counter = 0;
			int closest = 0;
			
			while (counter < array.length) {
				
				int currentClosest = searchValue - array[counter].age;
				currentClosest = Math.abs(currentClosest);
				
				if(currentClosest == 0){
					return counter;
				}
				
				if(closest == 0 || currentClosest < closest){
					closest = currentClosest;
				}
				
				counter = counter + 1;
			}

			return closest;
		}
	 
	 //algorithm 4: reverse an array

	 public static WaterBottle[] reverseArray(WaterBottle array[]) { 
			int length = array.length;
			WaterBottle temp; 
			for (int i = 0; i < length / 2; i++) { 
				temp = array[i]; 
				array[i] = array[length - i - 1]; 
				array[length - i - 1] = temp; 
			}
			return array;
		}
	 
	// algorithm 5: remove duplicate element from an array
	 
	 public static String[] removeDuplicate(Student array[]) {
			// copy cities first for sorting
			String[] cities = new String[array.length];
			for(int i = 0; i < array.length; i++) {
				cities[i] = array[i].residentCity;
			}	
			Arrays.sort(cities);
			
			int length = cities.length;
			String[] result = new String[length];
			
			int j = 0;
			for (int i = 0; i < length - 1; i++){
				if (cities[i] != cities[i+1]){
					result[j] = cities[i];
					j = j + 1;
				}
			}
			result[j] = cities[length - 1];

			return result;
		}
	 
	 
	public static void main(String[] args) {
		

	}

}
