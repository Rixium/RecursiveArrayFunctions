
public class RecursiveArrayFunctions {

	/* Several recursive functions for use when
	 * searching through arrays.
	 */
	
	public static void main(String[] args) {
		// An array of our numbers.
		int[] numbers = { 25, 10, 43, 2, 21 };
		
		// Output the sum of the values.
		System.out.println(sum(0, numbers));
		
		// Output the number of values.
		System.out.println(count(0, numbers));
		
		// Output the largest integer in the list.
		System.out.println(maxNum(1, numbers, numbers[0]));
	}
	
	// Adds each number in an array to each other recursively.
	public static int sum(int index, int[] numbers) {
		return index == numbers.length - 1 ? numbers[index] : numbers[index] + sum(++index, numbers);
	}
	
	// Counts the amount of items in an array recursively.
	public static int count(int index, int[] numbers) {
		return index == numbers.length ? index : count(++index, numbers);
	}
	
	// Recursively searches through an array for the biggest value.
	public static int maxNum(int index, int[] numbers, int maxNum) {
		if(index == numbers.length)
			return maxNum;
		else
			return numbers[index] > maxNum ? maxNum(index + 1, numbers, numbers[index]) :  maxNum(index + 1, numbers, maxNum);
	}
}
