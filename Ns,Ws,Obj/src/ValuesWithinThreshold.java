
public class ValuesWithinThreshold {
	
	static boolean checkConfines(int[] array, int lowerBound, int upperBound) {
		int counter = 0;

		while (counter < array.length) {
			
			if(array[counter] < lowerBound || array[counter] > upperBound){
				return true;
			}
			
			counter = counter + 1;
		}

		return false;
	}

	public static void main(String[] args) {
		int array[] = {1,3,4,7,10};
		int lowerLimit = 0;
		int upperLimit = 11;
		
		System.out.println(checkConfines(array, lowerLimit, upperLimit ));
		
		
		
	}

}
