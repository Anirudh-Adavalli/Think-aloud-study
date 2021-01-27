
public class BicycleWheel {
	float radiusInInch;
	
	BicycleWheel(float radius){
		radiusInInch = radius;
	}
	
	public static void main(String args[]) {
		BicycleWheel[] array = new BicycleWheel[4];
		array[0] = new BicycleWheel(1);
		array[1] = new BicycleWheel(3);
		array[2] = new BicycleWheel(5);
		array[3] = new BicycleWheel(7);
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