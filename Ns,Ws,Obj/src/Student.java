import static java.util.*;

public class Student {
	int age;
	String residentCity;
	
	public static void main(String args[]) {
		Student[] array = new Student[4];
		array[0].residentCity = "Chemnitz";
		array[1].residentCity = "Meerane";
		array[2].residentCity = "Chemnitz";
		array[3].residentCity = "Borna";
		System.out.println(removeDuplicate(array));
	}

	static String[] removeDuplicate(Student array[]) {
		String[] cities = new String[array.length];
		for(int i = 0; i < array.length; i++) {
			cities[i] = array[i].residentCity;
		}	
		Arrays.sort(cities);
			
		int length = cities.length;
		String[] result = new String[length];
			
		int j = 0;
		for (int i = 0; i < length - 1; i++){
			if (cities[i] != cities[i+1]){
				result[j] = cities[i];
				j = j + 1;
			}
		}
		result[j] = cities[length - 1];

		return result;
	}
}

// the result without duplicates is Borna, Chemnitz, Meerane
// the sorting needs to be understood for this order