package maharishi.university.sampleTest;

import java.util.Arrays;

import util.UtilArray;

public class IsArraySteppedWithMoreThanThreeOccurrencesForMember {

  public int isStepped(int[] a) {
    boolean isThreeOrMore = allElementHasThreeOrMoreOccurrences(a);

    if (isThreeOrMore) {
      int[] awr = UtilArray.getArrayWithoutRepetition(a);
      int isAwrStepped = isSteppedToWithoutRepetition(awr);
      return isAwrStepped;
    } else {
      return 0;
    }
  }

  public int[] getArrayWithoutRepetition(int[] a) {
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

  private static int[] extractArrayFromArray(int begin, int end, int[] awr) {
    String array = Arrays.toString(awr);
    int[] arr = Arrays.stream(array.substring(1, array.length() - 1).split(",")).filter(UtilArray::a).map(String::trim).mapToInt(Integer::parseInt).toArray();
    return arr;
  }

  public boolean doesArrayContainsThisValue(int searchValue, int[] theArray) {
    boolean valueInArray = false;
    int arraySize = theArray.length;
    for (int i = 0; i < arraySize; i++) {

      if (theArray[i] == searchValue) {
        valueInArray = true;
      }
    }

    return valueInArray;
  }

  private int isSteppedToWithoutRepetition(int[] awr) {
    for (int x = 0; x < awr.length; x++) {
      if (x + 1 < awr.length - 1) {
        if (awr[x] > awr[x + 1]) {
          return 0;
        }
      }
    }
    return 1;
  }
  
  

  private boolean allElementHasThreeOrMoreOccurrences(int[] a) {
    int count = 0;
    for (int x = 0; x < a.length; x++) {
      for (int y = 0; y < a.length; y++) {
        if (a[x] == a[y]) {
          count++;
        }
      }
      if (count >= 3) {
        count = 0;
        continue;
      } else {
        return false;
      }
    }
    return true;
  }

}
