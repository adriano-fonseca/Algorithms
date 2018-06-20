package sort.algoritms.example;

public class BubbleSort {

	public static void main(String[] args) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };

		InsertationSort.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

	// This bubble sort will sort everything from
	// smallest to largest
	public static void sort(int[] theArray) {

		// i starts at the end of the Array
		// As it is decremented all indexes greater
		// then it are sorted
		for (int i = theArray.length - 1; i > 1; i--) {
			// The inner loop starts at the beginning of
			// the array and compares each value next to each
			// other. If the value is greater then they are
			// swapped
			for (int j = 0; j < i; j++) {

				// To change sort to Descending change to <
				if (theArray[j] > theArray[j + 1]) {
					swapValues(j, j + 1, theArray);
				}
			}

		}
	}

	public static void swapValues(int indexOne, int indexTwo, int[] theArray) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
}
