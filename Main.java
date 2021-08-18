import java.util.Arrays;

class Main {
	// Find the missing number in the given array
		public static int getMissingNumber(int[] arr)
		{
			// actual size is arr.length + 1 since a number is missing from the array
			int m = arr.length + 1;

			// get sum of integers between 1 to arr.length + 1
			int total = m * (m + 1) / 2;

			// get actual sum of integers in the array
			int sum = Arrays.stream(arr).sum();

			// the missing number is the difference between the expected sum
			// and the actual sum
			return total - sum;
		}

		public static void main(String[] args)
		{
			int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

			System.out.println("The missing number is " + getMissingNumber(arr));
		}
}