// Closest Value

public class ClosestValue {
	
	 static int findClosest(int[] arr, int target) {
		int index = 0;
		int dist = Math.abs(arr[0] - target);

		for (int i = 1; i< arr.length; i++) {
			int cdist = Math.abs(arr[i] - target);

			if (cdist < dist) {
				index = i;
				dist = cdist;
			}
		}

		return arr[index];
	}

	public static void main(String[] args) {
		
		int array[] = {1,3,4,7,10};
		int serachValue = 11;
		System.out.println(findClosest(array, serachValue));

	}

}
