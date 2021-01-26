
public class ArrayAverage {
	
	static float arrayAverage(int[] array) {
		int counter = 0;
		int sum = 0;

		while (counter < array.length) {
			sum = sum + array[counter];
			counter = counter + 1;
		}

		float average = sum / (float) counter;
		return average;
	}

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		System.out.println(arrayAverage(array));
	}

}




