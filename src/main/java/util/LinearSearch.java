package util;

public class LinearSearch {

	public static void main(String[] args) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		UtilArray.printHorzArray(-1, -1, inputArr);
		LinearSearch.search(89, inputArr);
	}

	public static String search(int value, int[] theArray) {

		boolean valueInArray = false;

		String indexsWithValue = "";

		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				indexsWithValue += i + " ";
			}
			// printHorzArray(i, -1, theArray);

		}

		if (!valueInArray) {
			indexsWithValue = "None";
		}

		System.out.print("The Value was Found in the Following: " + indexsWithValue);
		System.out.println();
		return indexsWithValue;

	}

}
