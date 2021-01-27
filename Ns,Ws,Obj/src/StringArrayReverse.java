

public class StringArrayReverse {
	
	 public static String[] reverseWordArray(String words[]) { 
			int length = words.length;
			String temp;
			for (int i = 0; i < length / 2; i++) { 
				temp = words[i]; 
				words[i] = words[length  - i - 1];
				words[length - i - 1] = temp;
			}
			return words;
		}
	 
	public static void main(String[] args) {
		String array[] = {"BMW", "Volvo", "Benz", "Audi"};
		String newArray[] = reverseWordArray(array);
		for(int k = 0; k <= newArray.length - 1; k++) {
        	System.out.println(newArray[k]);
        }
	}
}


