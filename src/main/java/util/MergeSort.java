package util;

public class MergeSort {

	public static void main(String a[]) {

		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		
		MergeSort.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	public static void sort(int inputArr[]) {
		
		int length = inputArr.length;
		int[] tempMergArr = new int[length];
		doMergeSort(0, length - 1, inputArr, tempMergArr);
	}

	private static void doMergeSort(int lowerIndex, int higherIndex, int[] inputArr, int[] tempMergArr) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle, inputArr, tempMergArr);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex, inputArr, tempMergArr);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex, inputArr, tempMergArr);
		}
	}

	private static void mergeParts(int lowerIndex, int middle, int higherIndex, int[] array, int[] tempMergArr) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
}
