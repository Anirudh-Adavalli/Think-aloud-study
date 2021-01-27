import java.util.Arrays;

public class RemoveDuplicateWords {
	
	 public static String[] removeDuplicateWords(String words[]) {
			Arrays.sort(words);
			int length = words.length;
			String[] result = new String[length];
			int j = 0;
			for (int i = 0; i < length - 1; i++){
				if (words[i] != words[i + 1]){
					result[j] = words[i];
					j = j + 1;
				}
			}
			result[j] = words[length - 1];
			return result;
		}

	public static void main(String[] args) {
		String array[] = {"abc", "pqr", "xyz", "abc"};
		String  newArray[] = removeDuplicateWords(array);
		for(int k = 0; k <= newArray.length - 1; k++) {
        	System.out.println(newArray[k]);
		}
	}
}


