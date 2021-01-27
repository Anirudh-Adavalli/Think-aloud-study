
public class Tree {
	float heightInMeters;
	
	Tree(float height){
		heightInMeters = height;
	}
	
	public static void main(String[] args) {
		Tree[] array = new Tree[4];
		array[0] = new Tree(12.5);
		array[1] = new Tree(32.4);
		array[2] = new Tree(22.7);
		array[3] = new Tree(6.5);
		float lowerBound = 6.0;
		float upperBound = 40.0;
		System.out.println(checkConfines(array, lowerBound, upperBound));
	}
	
	static Boolean checkConfines(Tree[] array, float lowerBound, float upperBound) {
		int counter = 0;

		while (counter < array.length) {

			if(array[counter].heightInMeters < lowerBound || array[counter].heightInMeters > upperBound){
				return false;
			}

		counter = counter + 1;
		}

	return true;
	}
}

// true -> all values are within the bounds