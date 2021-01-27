
public class Movement {
	double velocityInMS;

	Movement(double velocity){
		velocityInMS = velocity;
	}	
	
	public static void main(String[] args) {
		Movement[] array = new Movement[4];
		array[0] = new Movement(1.4);
		array[1] = new Movement(5.0);
		array[2] = new Movement(14.0);
		array[3] = new Movement(7.0);
		double searchValue = 3.0;
		System.out.println(findClosest(array, searchValue));
	}
	
	static double findClosest(Movement[] arr, double target) {
		int index = 0;
		double dist = Math.abs(arr[0].velocityInMS - target);

		for (int i = 1; i< arr.length; i++) {
			double cdist = Math.abs(arr[i].velocityInMS - target);

			if (cdist < dist) {
				index = i;
				dist = cdist;
			}
		}

		return arr[index].velocityInMS;
	}

}

// the closest value to 3 is 1.4