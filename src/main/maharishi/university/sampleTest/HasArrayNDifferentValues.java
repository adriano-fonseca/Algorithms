package maharishi.university.sampleTest;

import java.util.Arrays;

import util.UtilArray;

public class HasArrayNDifferentValues {

  public int hasNValues(int[] a, int n) {
    int[] awr = getArrayWithoutRepetition(a);
    int occurences = awr.length;
    UtilArray.printArray(a);
  
    if (occurences == n) {
      return 1;
    } else {
      return 0;
    }
  }
  
  public static int[] getArrayWithoutRepetition(int[] a) {
    int[] awr = new int[a.length];
    int index = 0;
    for (int item : a) {
      if (!doesArrayContainsThisValue(item, awr)) {
        awr[index]=item;
        index++;
      }
    }
    
    return extractArrayFromArray(0,index,awr);
  }
  
  private static int[] extractArrayFromArray(int begin, int end, int[] awr) {
    String array = Arrays.toString(awr);
    int[] arr = Arrays.stream(array.substring(1, array.length()-1).split(","))
        .filter(UtilArray::a)
        .map(String::trim)
        .mapToInt(Integer::parseInt)
        .toArray();
    return arr;
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

}
