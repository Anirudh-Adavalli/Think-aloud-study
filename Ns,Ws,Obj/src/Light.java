import java.util.Arrays;

public class Light {
	float illuminanceInLux;
	
	Light(float illuminance){
		illuminanceInLux = illuminance;
	}
	
	public static void main(String args[]) {
		Light[] array = new Light[4];
		array[0] = new Light(50);
		array[1] = new Light(80);
		array[2] = new Light(50);
		array[3] = new Light(150);
		float[] result = removeDuplicate(array);
		for(int i = 0; i < result.length; i++){
			if(result[i] == 0)
				break;
			System.out.println(result[i]);
		}
	}
	
	static float[] removeDuplicate(Light array[]) {			
		float[] values = new float[array.length];
		for(int i = 0; i < array.length; i++) {
			values[i] = array[i].illuminanceInLux;
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