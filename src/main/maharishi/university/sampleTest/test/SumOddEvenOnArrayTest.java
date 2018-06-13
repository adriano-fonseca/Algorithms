package maharishi.university.sampleTest.test;

import org.junit.Assert;
import org.junit.Test;

import maharishi.university.sampleTest.SumOddEvenOnArray;

public class SumOddEvenOnArrayTest {
  SumOddEvenOnArray sum = new SumOddEvenOnArray();
  
  @Test
  public void test1() {
    Assert.assertEquals(-2, sum.f(new int[] { 1, 2, 3, 4 }));
  }

  @Test
  public void test2() {
    Assert.assertEquals(-2, sum.f(new int[] { 3, 3, 4, 4 })); 
  }

  @Test
  public void test3() {
    Assert.assertEquals(0,  sum.f(new int[] { 3, 2, 3, 4 })); 
  }
  
  @Test
  public void test4() {
    Assert.assertEquals(-2,  sum.f(new int[] { 4, 1, 2, 3 })); 
  }

  @Test
  public void test5() {
    Assert.assertEquals(-1, sum.f(new int[] { 1, 2 })); //-1
  }
  
  @Test
  public void test6() {
    Assert.assertEquals(2, sum.f(new int[] { 1, 2, 3 })); //-1
  }

  @Test
  public void test7() {
    Assert.assertEquals(2, sum.f(new int[] { 1, 1 })); //-1
  }

  @Test
  public void test8() {
    Assert.assertEquals(0, sum.f(new int[] {})); //-1
  }

  

}
