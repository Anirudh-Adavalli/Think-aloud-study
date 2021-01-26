import static java.util.*;

public class Rotation {
	int byDegree;
	
	public static void main(String args[]) {
		Rotation[] array = new Rotation[4];
		array[0].byDegree = 90;
		array[1].byDegree = 270;
		array[2].byDegree = 180;
		array[3].byDegree = 360;
		System.out.println(reverseArray(array));
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