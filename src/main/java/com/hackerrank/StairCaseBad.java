package hackerRank.com;

public class StairCaseBad {
  public static void main(String args[]){
    StairCaseSolution(10);
  }
  
  static void StairCaseSolution(int n) {
    int controll = n;
    
    for(int x=0; x < n; x++){
      for(int y=0; y < controll; y++){
            if(y==controll-1)   {
                printCompletatio(controll,n);
                System.out.println("#");
            }else{
                if(y < controll-1){
                    System.out.print(" ");    
                }
            }
        }
      controll--;
    }
}

  private static void printCompletatio(int controll,int n) {
    int a = n-controll;
    
    for(int x=0; x < a; x++){
      System.out.print("#");
    }
  }

}
