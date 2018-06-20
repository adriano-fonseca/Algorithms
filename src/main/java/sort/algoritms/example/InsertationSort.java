package sort.algoritms.example;

public class InsertationSort {

	public static void main(String[] args) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		
		InsertationSort.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

		// The Insertion Sort is normally the best of
		// the elementary sorts. Unlike the other sorts that
		// had a group sorted at any given time, groups are
		// only partially sorted here.
		public static void sort(int[] theArray) {
			for (int i = 1; i < theArray.length; i++) {
				int j = i;
				int toInsert = theArray[i];
				while ((j > 0) && (theArray[j - 1] > toInsert)) {
					theArray[j] = theArray[j - 1];
					j--;
					//UtilArray.printHorzArray(i, j, theArray);
				}
				theArray[j] = toInsert;
			}
		}
}
