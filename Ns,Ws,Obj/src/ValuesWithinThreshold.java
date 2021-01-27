
public class ValuesWithinThreshold {
	
	static boolean checkConfines(int[] array, int lowerBound, int upperBound) {
		int counter = 0;

		while (counter < array.length) {
			
			if(array[counter] < lowerBound || array[counter] > upperBound){
				return false;
			}
			counter = counter + 1;
		}
		return true;
	}

	public static void main(String[] args) {
		int array[] = {1,3,4,7,10};
		int lowerLimit = 3;
		int upperLimit = 11;
		System.out.println(checkConfines(array, lowerLimit, upperLimit ));	
	}

}
