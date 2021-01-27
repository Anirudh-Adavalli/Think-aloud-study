
public class AverageNumberOfCharacters {
	
	 static float arrayAverage(String[] array) {
		 	int counter = 0;
		 	int sum = 0;

		 	while (counter < array.length) {
		 		sum = sum + array[counter].length();
		 		counter = counter + 1;
		 	}

		 	float average = sum / (float) counter;
		 	return average;
		 }

	public static void main(String[] args) {
		
		String array[] = {"Jan","Samy","Anne","Lee"};
		System.out.println(arrayAverage(array));
	}
}




