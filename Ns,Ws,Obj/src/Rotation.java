
public class Rotation {
	int byDegree;
	
	Rotation(int degree){
		byDegree = degree;
	}
	
	public static void main(String args[]) {
		Rotation[] array = new Rotation[4];
		array[0] = new Rotation(90);
		array[1] = new Rotation(270);
		array[2] = new Rotation(180);
		array[3] = new Rotation(360);
		array = reverseArray(array);
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i].byDegree);
		}
	}
	
	static Rotation[] reverseArray(Rotation array[]) { 
		int length = array.length;
		Rotation temp; 
		for (int i = 0; i < length / 2; i++) { 
			temp = array[i]; 
			array[i] = array[length - i - 1]; 
			array[length - i - 1] = temp; 
		}
		return array;
	}
}

// the reverse of 90, 270, 180, 360 is 360, 180, 270, 90