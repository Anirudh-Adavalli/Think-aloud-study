import static java.util.*;

public class BicycleWheel {
	float radiusInInch;
	
	public static void main(String args[]) {
		BicycleWheel[] array = new BicycleWheel[4];
		array[0].radiusInInch = 1;
		array[1].radiusInInch = 3;
		array[2].radiusInInch = 5;
		array[3].radiusInInch = 7;
		System.out.println(arrayAverage(array));
	}
	
	static float arrayAverage(BicycleWheel[] array) {
		int counter = 0;
		float sum = 0;

		while (counter < array.length) {
			sum = sum + array[counter].radiusInInch;
			counter = counter + 1;
		}

		float average = sum / (float) counter;
		return average;
	}
}

// average of 1, 3, 5, 7 is 4