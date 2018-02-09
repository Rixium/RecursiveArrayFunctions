import java.util.Scanner;

public class RecursiveFunctions {

	/* Several recursive functions, that cover a variety of uses, from search to calculation.
	 */
	
	public static void main(String[] args) {
		// An array of our numbers.
		int[] numbers = { 25, 10, 43, 2, 21 };
		
		// Output the sum of the values.
		System.out.println(sum(0, numbers));
		
		System.out.println();
		
		// Output the number of values.
		System.out.println(count(0, numbers));
		
		System.out.println();
		
		// Output the largest integer in the list.
		System.out.println(maxNum(1, numbers, numbers[0]));
		
		System.out.println();
		
		// Passing in the first two numbers of the sequence, and the number of times to iterate.
		fibonacci(0, 1, 10);
		
		System.out.println();
		
		stackTransfer(3, 'A', 'B', 'C');
		
		System.out.println();
		
		// Question 1.
		System.out.println("Please enter an odd number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num % 2 == 0) {
			System.out.println("Not a valid number, please enter an odd number:");
			num = s.nextInt();
		}
		getOdds(num);
		System.out.println();
		
		// Question 2. // Recursive function, takes any number and calculates the odd numbers to it.
		getOdds(11);
		System.out.println();
		
		// Question 3. // The mystery function.
		System.out.println(mystery(5, 3)); // returns 125, 5^3.
		System.out.println();
		
		// Question 4. // University fibonacci.
		int result, n;
		
		System.out.println("Input sequence number: ");
		n = s.nextInt();
		
		// To get this working, I incremented by 1 rather than 2.
		// This works because when incrementing by skips every other result.
		// For all results, you need to increment by 1.
		// uniFibonacci(1) == 1
		// uniFibonacci(2) == 1
		// uniFibonacci(3) == uniFibonacci(2) + uniFibonacci(1) == 2
		
		for(int i = 1; i < n ; i++) {
			System.out.println(uniFibonacci(i));
		}
		
		System.out.println();
		
		tribonacci(0, 0, 1, 10);
	}
	
	// Adds each number in an array to each other recursively.
	public static int sum(int index, int[] numbers) {
		return index == numbers.length - 1 ? numbers[index] : numbers[index] + sum(++index, numbers);
	}
	
	// Counts the amount of items in an array recursively.
	public static int count(int index, int[] numbers) {
		return index == numbers.length ? index : count(++index, numbers);
	}
	
	// Question 1 & Question 2
	public static void getOdds(int n) {
		if(n > 0) {
			if(n % 2 != 0) {
				System.out.println(n);
			}
			getOdds(n - 1);
		}
	}
	
	// Question 3
	// Calculates the value of x^y.
	// I pass in x = 2, y = 2;
	// y != 0
	// return 2 * mystery(2, 1);
	// y != 0
	// return 2 * mystery(2, 0);
	// y == 0
	// return 1.
	// 2 * 1
	// 2 * 2
	// 4
	
	public static int mystery(int x, int y) {
		if ( y != 0)
			return ( x * mystery (x, y - 1));

		return 1;
	}
	
	// Question 4
	public static int uniFibonacci(int f) {
		if(f == 1 || f == 2)
			return 1;
		
		return uniFibonacci(f - 1) + uniFibonacci(f - 2);
	}
	
	// Recursively calculates the Tribonacci sequence to a given number.
	public static void tribonacci(int num1, int num2, int num3, int end) {
		System.out.print(num2 + " ");
		if(end > 0) {
			tribonacci(num2, num3, num1 + num2 + num3, --end);
		}
	}
	
	// Recursively searches through an array for the biggest value.
	public static int maxNum(int index, int[] numbers, int maxNum) {
		if(index == numbers.length)
			return maxNum;
		
		return numbers[index] > maxNum ? maxNum(index + 1, numbers, numbers[index]) :  maxNum(index + 1, numbers, maxNum);
	}
	
	// Recursively calculates the Fibonacci sequence to a given number.
	public static void fibonacci(int num1, int num2, int end) {
		System.out.print(num2 + " ");
		if(end > 0) {
			fibonacci(num2, num1 + num2, --end);
		}
	}
	
	// Pancake stack transfer.
	public static void stackTransfer(int n, char a, char b, char c) {
		if(n == 1) {
			System.out.println(a + " -> " + c);
			return;
		}
		
		stackTransfer(n - 1, a, c, b);
		System.out.println(a + " -> " + c);
		stackTransfer(n - 1, b, a, c);
	}
	
}
