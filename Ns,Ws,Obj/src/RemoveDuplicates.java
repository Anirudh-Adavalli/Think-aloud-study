import java.util.Arrays;

public class RemoveDuplicates {
	
	  static int[] removeDuplicateNumber(int arr[]) {
			Arrays.sort(arr);
			
			int length = arr.length;
			int[] result = new int[length];
			int j = 0;
			for (int i = 0; i < length - 1; i++){
				if (arr[i] != arr[i + 1]){
					result[j] = arr[i];
					j = j + 1;
				}
			}
			result[j] = arr[length - 1];
			return result;
		}

	public static void main(String[] args) {
		int array[] = {3,7,9,9,3};
		int newArray[] = removeDuplicateNumber(array);
		for(int k = 0; k <= newArray.length - 1; k++) {
        	System.out.println(newArray[k]);
		}
	}
}


