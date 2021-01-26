import static java.util.*;

public class Light {
	float illuminance;
	
	public static void main(String args[]) {
		Light[] array = new Light[4];
		array[0].illuminance = 50;
		array[1].illuminance = 80;
		array[2].illuminance = 50;
		array[3].illuminance = 150;
		System.out.println(removeDuplicate(array));
	}
	
	static float[] removeDuplicate(Light array[]) {			
		float[] values = new float[array.length];
		for(int i = 0; i < array.length; i++) {
			values[i] = array[i].illuminance;
		}	
		Arrays.sort(values);
			
		int length = values.length;
		float[] result = new float[length];
			
		int j = 0;
		for (int i = 0; i < length - 1; i++){
			if (values[i] != values[i + 1]){
				result[j] = values[i];
				j = j + 1;
			}
		}
		result[j] = values[length - 1];

		return result;
	}
}

// the result without duplicates is 50, 80, 150
// the sorting does not need to be understood for this order