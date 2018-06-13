package maharishi.university.sampleTest;

public class EquivalentArrays {

  public int equivalentArrays(int[ ] a1, int[ ] a2){
    boolean eq = false;
    int[] array1and2 = new int[a1.length + a2.length];
    System.arraycopy(a1, 0, array1and2, 0, a1.length);
    System.arraycopy(a2, 0, array1and2, a1.length, a2.length);
    
    for(int x=0; x < array1and2.length; x++){
      if(isPresentInArray(a1, array1and2[x]) && isPresentInArray(a2, array1and2[x])){
            eq=true;
            continue;
      }else{
          eq=false;
          break;
        }
    }
    
    if(eq){
      return 1;
    }else{
      return 0;
    }
  }

  boolean isPresentInArray(int[] a1, int member) {
    for (int a : a1) {
      if (a == member) {
        return true;
      }
    }
    return false;
  }

  int countMember(int[] a1, int member) {
    int times = 0;

    for (int a : a1) {
      if (a == member) {
        times++;
      }
    }

    return times;
  }
}






