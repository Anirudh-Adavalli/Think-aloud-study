
public class ValuesWithinThresholdWords {
	
	 static boolean checkConfines(String[] array, int lowerBound, int upperBound) {
			int counter = 0;

			while (counter < array.length) {
				
				if(array[counter].length() < lowerBound || array[counter].length() > upperBound){
					return false;
				}
				
				counter = counter + 1;
			}

			return true;
		}

	public static void main(String[] args) {
		String array[] = {"Fürth","Ulm","Berlin","Chemnitz"};
		int lowerLimit = 4;
		int upperLimit = 8;
		System.out.println(checkConfines(array, lowerLimit, upperLimit ));	
	}
}
