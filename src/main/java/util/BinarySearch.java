package util;

public class BinarySearch {

	public static void main(String[] args) {
		int[] inputArr = { 4, 11, 23, 28, 28, 43, 45, 65, 77 };
		UtilArray.printHorzArray(-1, -1, inputArr);
		BinarySearch.search(28, inputArr);
	}

	// The Binary Search is quicker than the linear search
	// because all the values are sorted. Because everything
	// is sorted once you get to a number larger than what
	// you are looking for you can stop the search. Also
	// you be able to start searching from the middle
	// which speeds the search. It also works best when
	// there are no duplicates
	public static void search(int value, int[] theArray) {
		int lowIndex = 0;
		int highIndex = theArray.length - 1;

		while (lowIndex <= highIndex) {

			int middleIndex = (highIndex + lowIndex) / 2;
			if (theArray[middleIndex] < value) {
				lowIndex = middleIndex + 1;
			} else if (theArray[middleIndex] > value) {
				highIndex = middleIndex - 1;
			} else {
				System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
				lowIndex = highIndex + 1;
			}

			

		}

	}
}
