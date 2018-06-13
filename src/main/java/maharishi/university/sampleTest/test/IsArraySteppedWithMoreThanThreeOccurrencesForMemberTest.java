package maharishi.university.sampleTest.test;

import org.junit.Assert;
import org.junit.Test;

import maharishi.university.sampleTest.IsArraySteppedWithMoreThanThreeOccurrencesForMember;


public class IsArraySteppedWithMoreThanThreeOccurrencesForMemberTest {
  
  IsArraySteppedWithMoreThanThreeOccurrencesForMember checkArrayStepped = new IsArraySteppedWithMoreThanThreeOccurrencesForMember();
  
  @Test
  public void test1() {
    Assert.assertEquals(0, checkArrayStepped.isStepped(new int[] {0, 1, 2})); 
  }
  
  @Test
  public void test2() {
    Assert.assertEquals(1, checkArrayStepped.isStepped(new int[] {1, 1, 1, 5, 5, 5, 5, 8, 8, 8} )); 
  }
  
  @Test
  public void test3() {
    Assert.assertEquals(0, checkArrayStepped.isStepped(new int[] {1, 1, 5, 5, 5, 5, 8, 8, 8}));  
  }
  
  @Test
  public void test4() {
    Assert.assertEquals(0, checkArrayStepped.isStepped(new int[] {5, 5, 5, 15}));   }
  
  @Test
  public void test5() {
    Assert.assertEquals(0, checkArrayStepped.isStepped(new int[] {3, 3, 3, 2, 2, 2, 5, 5, 5})); 
  }
  
  @Test
  public void test6() {
    Assert.assertEquals(0, checkArrayStepped.isStepped(new int[] {3, 3, 3, 2, 2, 2, 1, 1, 1})); 
  }
  
  @Test
  public void test7() {
    Assert.assertEquals(1, checkArrayStepped.isStepped(new int[] {1, 1, 1})); 
  }
  
  @Test
  public void test8() {
    Assert.assertEquals(1, checkArrayStepped.isStepped(new int[] {1, 1, 1, 1, 1, 1, 1})); 
  }
}
