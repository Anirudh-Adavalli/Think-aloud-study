
public class Person {
	int ageInYears;
	
	Person(int age){
		ageInYears = age;
	}	
	
	public static void main(String[] args) {
		Person[] array = new Person[4];
		array[0] = new Person(18);
		array[1] = new Person(22);
		array[2] = new Person(29);
		array[3] = new Person(27);
		int searchValue = 25;
		System.out.println(findClosest(array, searchValue));
	}
	
	static int findClosest(Person[] arr, int target) {
		int index = 0;
		int dist = Math.abs(arr[0].ageInYears - target);

		for (int i = 1; i< arr.length; i++) {
			int cdist = Math.abs(arr[i].ageInYears - target);

			if (cdist < dist) {
				index = i;
				dist = cdist;
			}
		}

		return arr[index].ageInYears;
	}

}

// out of 18, 22, 29, 27, the closest value to 25 is 27