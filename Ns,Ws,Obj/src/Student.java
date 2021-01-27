import java.util.Arrays;

public class Student {
	String residentCity;
	
	Student(String city){
		residentCity = city;
	}
	
	public static void main(String args[]) {
		Student[] array = new Student[4];
		array[0] = new Student("Chemnitz");
		array[1] = new Student("Meerane");
		array[2] = new Student("Chemnitz");
		array[3] = new Student("Borna");
		String[] result = removeDuplicate(array);
		for(int i = 0; i < result.length; i++){
		    if(result[i] == null)
		        break;
			System.out.println(result[i]);
		}
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