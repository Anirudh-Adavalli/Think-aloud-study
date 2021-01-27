
public class Sound {
	int frequencyInHertz;
	
	Sound(int frequency){
		frequencyInHertz = frequency;
	}
	
	public static void main(String args[]) {
		Sound[] array = new Sound[4];
		array[0] = new Sound(8);
		array[1] = new Sound(10);
		array[2] = new Sound(6);
		array[3] = new Sound(16);
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