
package util;

import java.util.Arrays;
import java.util.List;

public class UtilArray {

  public static void printArray(int[] a) {
    for (int y = 0; y < a.length; y++) {
      System.out.println("a[" + y + "]=" + a[y]);
    }
  }

  public void generateRandomArray(int arraySize, int offset) {
    int[] theArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      theArray[i] = (int) (Math.random() * 10) + offset;
    }
  }

  public void swapValues(int indexOne, int indexTwo, int[] theArray) {
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
        awr[index]=item;
        index++;
      }
    }
    
    return extractArrayFromArray(0,index,awr);
  }

  public static int[] extractArrayFromArray(int begin, int end, int[] awr) {
    String array = Arrays.toString(awr);
    int[] arr = Arrays.stream(array.substring(1, array.length()-1).split(","))
        .filter(UtilArray::a)
        .map(String::trim)
        .mapToInt(Integer::parseInt)
        .toArray();
    return arr;
  }
  
  public static List<Integer> intArrayToList(int[] a, int it, List<Integer> lista) {
    if(it>a.length-1){
      return lista;
    }else{
      lista.add(a[it]);
      return intArrayToList(a, it+1,lista);
    }
  }
  
  public  static boolean a(String i){
    i=i.trim();
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

}
