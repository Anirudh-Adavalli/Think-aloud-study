
public class WordsClosestValue {
	
	 static int findClosest(String [] arr, int target) {
		int index = 0;
		int dist = Math.abs(arr[0].length() - target);

		for (int i = 1; i< arr.length; i++) {
			int cdist = Math.abs(arr[i].length() - target);

			if (cdist < dist) {
				index = i;
				dist = cdist;
			}
		}

		return arr[index].length();
	}

	public static void main(String[] args) {
		
		String array[] = {"Leo","Thor","Johnny", "Penny" }; 
		int searchValue = 8;
		System.out.println(findClosest(array,searchValue)+" is the closest string length to "+searchValue);	
	}
}


