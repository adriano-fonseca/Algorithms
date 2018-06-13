package maharishi.university.sampleTest;


public class ThirdLargestOnArray {

 public int f(int[] a) {
    if (a.length == 0) {
      return -1;
    } else {
      //Ordena de forma crescente
      a = sortArray(a,false);
      return getThirdLargest(a);
    }
 }

  private int getThirdLargest(int[] a) {
    int maior = a[a.length - 1];
    int secondBigger = -1;
    for (int ind = a.length - 2; ind >= 0; ind--) {

      if (maior != a[ind]) {
        if(a[ind]>secondBigger){
        secondBigger = a[ind];
        }
      }
      
      if(secondBigger != a[ind] && a[ind] < maior){
        return a[ind];
      }
    }
    return -1;
  }

  private int[] sortArray(int[] a, Boolean desc) {
    for (int x = 0; x < a.length; x++) {
      int minimum = x;

      for (int y = x; y < a.length; y++) {
        if (desc) {
          if (a[minimum] < a[y]) {
            minimum = y;
          }
        } else {
          if (a[minimum] > a[y]) {
            minimum = y;
          }
        }
      }
      swapValues(x, minimum, a);
    }

    for (int y = 0; y < a.length; y++) {

    }

    return a;
  }

  public void swapValues(int indexOne, int indexTwo, int[] theArray) {
    int temp = theArray[indexOne];
    theArray[indexOne] = theArray[indexTwo];
    theArray[indexTwo] = temp;
  }
}
