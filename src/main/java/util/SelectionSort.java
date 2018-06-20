package util;

public class SelectionSort {

	public static void main(String[] args) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };

		InsertationSort.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	// Selection sort search for the smallest number in the array
	// saves it in the minimum spot and then repeats searching
	// through the entire array each time
	public void sort(int[] theArray) {

		for (int x = 0; x < theArray.length; x++) {
			int minimum = x;

			for (int y = x; y < theArray.length; y++) {
				// To change direction of sort just change
				// this from > to <
				if (theArray[minimum] > theArray[y]) {
					minimum = y;
				}
			}
			swapValues(x, minimum, theArray);
			// printHorzArray(x, -1, theArray);
		}

	}
	
	public static void swapValues(int indexOne, int indexTwo, int[] theArray) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

}
