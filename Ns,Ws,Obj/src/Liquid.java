
public class Liquid {
	double densityInkgcm;
	
	Liquid(double density){
		densityInkgcm = density;
	}
	
	public static void main(String[] args) {
		Liquid[] array = new Liquid[4];
		array[0] = new Liquid(0.2);
		array[1] = new Liquid(1.2);
		array[2] = new Liquid(860);
		array[3] = new Liquid(970);
		double lowerBound = 0.08;
		double upperBound = 700;
		System.out.println(checkConfines(array, lowerBound, upperBound));
	}
	
	static Boolean checkConfines(Liquid[] array, double lowerBound, double upperBound) {
		int counter = 0;

		while (counter < array.length) {

			if(array[counter].densityInkgcm < lowerBound || array[counter].densityInkgcm > upperBound){
				return false;
			}

		counter = counter + 1;
		}

	return true;
	}
}

// false -> not all values are within the bounds