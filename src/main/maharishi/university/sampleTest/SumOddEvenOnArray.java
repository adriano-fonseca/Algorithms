package maharishi.university.sampleTest;

public class SumOddEvenOnArray {
  
  public int f(int[] a){
    int evenSum = 0;
    int oddSum = 0;
    for(int item : a){
      if(item%2==0){
        evenSum = evenSum +item;
      }else{
        oddSum = oddSum + item;
      }
    }
    return oddSum-evenSum;
  }
}
