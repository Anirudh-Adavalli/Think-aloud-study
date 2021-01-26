import static java.util.*;

public class Sound {
	int frequencyInHertz;
	
	public static void main(String args[]) {
		Sound[] array = new Sound[4];
		array[0].frequencyInHertz = 8;
		array[1].frequencyInHertz = 10;
		array[2].frequencyInHertz = 6;
		array[3].frequencyInHertz = 16;
		System.out.println(arrayAverage(array));
	}
	
	static float arrayAverage(Sound[] array) {
		int counter = 0;
		int sum = 0;

		while (counter < array.length) {
			sum = sum + array[counter].frequencyInHertz;
			counter = counter + 1;
		}

		float average = sum / (float) counter;
		return average;
	}
}

// average of 8, 10, 6, 16 is 10