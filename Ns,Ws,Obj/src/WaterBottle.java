
public class WaterBottle {
	double contentInLiter;
	
	WaterBottle(double content){
		contentInLiter = content;
	}
	
	public static void main(String args[]) {
		WaterBottle[] array = new WaterBottle[4];
		array[0] = new WaterBottle(1.0);
		array[1] = new WaterBottle(1.5);
		array[2] = new WaterBottle(2.0);
		array[3] = new WaterBottle(0.5);
		array = reverseArray(array);
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i].contentInLiter);
		}
	}
	
	static WaterBottle[] reverseArray(WaterBottle array[]) { 
		int length = array.length;
		WaterBottle temp; 
		for (int i = 0; i < length / 2; i++) { 
			temp = array[i]; 
			array[i] = array[length - i - 1]; 
			array[length - i - 1] = temp; 
		}
		return array;
	}
}

// the reverse of 1.0, 1.5, 2.0, 0.5 is 0.5, 2.0, 1.5, 1.0