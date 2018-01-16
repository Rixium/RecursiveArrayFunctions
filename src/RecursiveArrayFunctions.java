
public class RecursiveArrayFunctions {

	/* Several recursive functions for use when
	 * searching through arrays.
	 */
	
	public static void main(String[] args) {
		// An array of our numbers.
		int[] numbers = { 25, 10, 12, 2, 28 };
		
		// Output the sum of the values.
		System.out.println(sum(0, numbers));
		
		// Output the number of values.
		System.out.println(count(0, numbers));
		
		// Output the largest integer in the list.
		System.out.println(maxNum(1, numbers, numbers[0]));
	}
	
	// Adds each number in an array to each other recursively.
	public static int sum(int index, int[] numbers) {
		if(index == numbers.length - 1) {
			return numbers[index];
		} else {
			return numbers[index] + sum(++index, numbers);
		}
	}
	
	// Counts the amount of items in an array recursively.
	public static int count(int index, int[] numbers) {
		if(index == numbers.length) {
			return index;
		} else {
			return count(++index, numbers);
		}
	}
	
	// Recursively searches through an array for the biggest value.
	public static int maxNum(int index, int[] numbers, int maxNum) {
		if(index == numbers.length) {
			return maxNum;
		} else {
			if(numbers[index] > maxNum) {
				return maxNum(index + 1, numbers, numbers[index]);
			} else {
				return maxNum(index + 1, numbers, maxNum);
			}
		}
	}
}
