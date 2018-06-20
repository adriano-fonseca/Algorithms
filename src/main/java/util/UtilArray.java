
package util;

import java.util.Arrays;
import java.util.List;

public class UtilArray {

	public static void printArray(int[] theArray) {

		System.out.println("----------");
		for (int i = 0; i < theArray.length; i++) {

			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");

			System.out.println("----------");

		}

	}

	public void generateRandomArray(int arraySize, int offset) {
		int[] theArray = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + offset;
		}
	}

	public static void swapValues(int indexOne, int indexTwo, int[] theArray) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

	public int getValueAtIndex(int index, int[] theArray) {
		int arraySize = theArray.length;

		if (index < arraySize) {
			return theArray[index];
		}
		return 0;

	}

	public static int[] getArrayWithoutRepetition(int[] a) {
		int[] awr = new int[a.length];
		int index = 0;
		for (int item : a) {
			if (!doesArrayContainsThisValue(item, awr)) {
				awr[index] = item;
				index++;
			}
		}

		return extractArrayFromArray(0, index, awr);
	}

	public static int[] extractArrayFromArray(int begin, int end, int[] awr) {
		String array = Arrays.toString(awr);
		int[] arr = Arrays.stream(array.substring(1, array.length() - 1).split(",")).filter(UtilArray::a)
				.map(String::trim).mapToInt(Integer::parseInt).toArray();
		return arr;
	}

	public static List<Integer> intArrayToList(int[] a, int it, List<Integer> lista) {
		if (it > a.length - 1) {
			return lista;
		} else {
			lista.add(a[it]);
			return intArrayToList(a, it + 1, lista);
		}
	}

	public static boolean a(String i) {
		i = i.trim();
		return !i.equals("0");
	}

	public static boolean doesArrayContainsThisValue(int searchValue, int[] theArray) {
		boolean valueInArray = false;
		int arraySize = theArray.length;
		for (int i = 0; i < arraySize; i++) {

			if (theArray[i] == searchValue) {
				valueInArray = true;
			}
		}

		return valueInArray;
	}

	public void deleteIndex(int index, int[] theArray) {
		int arraySize = theArray.length;
		if (index < arraySize) {
			for (int i = index; i < (arraySize - 1); i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize--;
		}
	}

	public void insertValue(int value, int[] theArray) {
		int arraySize = theArray.length;

		if (arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}

	public static int isSteppedToWithoutRepetition(int[] awr) {
		for (int x = 0; x < awr.length; x++) {
			if (x + 1 < awr.length - 1) {
				if (awr[x] > awr[x + 1]) {
					return 0;
				}
			}
		}
		return 1;
	}

	public int ArrayHasNDifferentValues(int[] a, int n) {
		int[] awr = UtilArray.getArrayWithoutRepetition(a);
		int occurences = awr.length;
		UtilArray.printArray(a);

		if (occurences == n) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void printArray(String[] myArray) {
		for (int y = 0; y < myArray.length; y++) {
			System.out.println("a[" + y + "]=" + myArray[y]);
		}
	}

	public int[] generateRandomArray(int size) {
		int[] theArray = new int[size];
		for (int i = 0; i < size; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
		return theArray;
	}

	public static boolean doesArrayContainThisValue(int searchValue, int[] theArray) {

		boolean valueInArray = false;

		for (int i = 0; i < theArray.length; i++) {

			if (theArray[i] == searchValue) {

				valueInArray = true;

			}

		}

		return valueInArray;

	}

	public String linearSearchForValue(int value, int[] theArray) {

		boolean valueInArray = false;

		String indexsWithValue = "";

		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				indexsWithValue += i + " ";
			}
			//printHorzArray(i, -1, theArray);

		}

		if (!valueInArray) {
			indexsWithValue = "None";
		}

		System.out.print("The Value was Found in the Following: " + indexsWithValue);
		System.out.println();
		return indexsWithValue;

	}

	public static void printHorzArray(int i, int j, int[] theArray) {

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < theArray.length; n++) {

			System.out.print("| " + n + "  ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < theArray.length; n++) {

			System.out.print("| " + theArray[n] + " ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		// END OF FIRST PART

		// ADDED FOR BUBBLE SORT

		if (j != -1) {

			// ADD THE +2 TO FIX SPACING

			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");

			System.out.print(j);

		}

		// THEN ADD THIS CODE

		if (i != -1) {

			// ADD THE -1 TO FIX SPACING

			for (int l = 0; l < (5 * (i - j) - 1); l++)
				System.out.print(" ");

			System.out.print(i);

		}

		System.out.println();

	}

	// This bubble sort will sort everything from
	// smallest to largest

	public static void bubbleSort(int[] theArray) {

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

					printHorzArray(i, j, theArray);

				}

			}

		}

	}

	// The Binary Search is quicker than the linear search
	// because all the values are sorted. Because everything
	// is sorted once you get to a number larger than what
	// you are looking for you can stop the search. Also
	// you be able to start searching from the middle
	// which speeds the search. It also works best when
	// there are no duplicates
	public static void binarySearchForValue(int value, int[] theArray) {

		int lowIndex = 0;
		int highIndex = theArray.length - 1;

		while (lowIndex <= highIndex) {

			int middleIndex = (highIndex + lowIndex) / 2;

			if (theArray[middleIndex] < value)
				lowIndex = middleIndex + 1;

			else if (theArray[middleIndex] > value)
				highIndex = middleIndex - 1;

			else {

				System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);

				lowIndex = highIndex + 1;

			}

			// printHorzArray(middleIndex, -1);

		}

	}

	// Selection sort search for the smallest number in the array
	// saves it in the minimum spot and then repeats searching
	// through the entire array each time

	public void selectionSort(int[] theArray) {

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

			//printHorzArray(x, -1, theArray);
		}

	}

	// The Insertion Sort is normally the best of
	// the elementary sorts. Unlike the other sorts that
	// had a group sorted at any given time, groups are
	// only partially sorted here.

	public void insertionSort(int[] theArray) {

		for (int i = 1; i < theArray.length; i++) {
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsert)) {
				theArray[j] = theArray[j - 1];
				j--;

				printHorzArray(i, j, theArray);

			}
			theArray[j] = toInsert;
		}
	}
  
//Reverse the indent values in the array
	// so that they go from biggest to smallest
	public static int[] reverseArray(int[] theArray) {

		// Index of the first element
		int leftIndex = 0;

		// Index of last element
		int rightIndex = theArray.length - 1;

		while (leftIndex < rightIndex) {
			// Exchange the left and right elements
			int temp = theArray[leftIndex];
			theArray[leftIndex] = theArray[rightIndex];
			theArray[rightIndex] = temp;

			// Move the indexes to check towards the middle
			leftIndex++;
			rightIndex--;
		}

		return theArray;
	}


}
